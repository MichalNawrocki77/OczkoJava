import java.io.*;
import java.util.*;

class Karty{
    public String Kolor;
    public String Figura;
    public int Wartosc;

    public Karty(){}
    public Karty(String kolor, String figura, int wartosc)
    {
        Kolor=kolor;
        Figura=figura;
        Wartosc=wartosc;
    }

    public static ArrayList<Karty> TworzenieTalii(int PoziomTrudnosci, ArrayList<Karty> TaliaDoGry){
        for(int i=0;i<PoziomTrudnosci;i++)
        {
            //Trefle//
            TaliaDoGry.add(new Karty("Trefl","Dwójka",2));
            TaliaDoGry.add(new Karty("Trefl","Trójka",3));
            TaliaDoGry.add(new Karty("Trefl","Czwórka",4));
            TaliaDoGry.add(new Karty("Trefl","Piątka",5));
            TaliaDoGry.add(new Karty("Trefl","Szóstka",6));
            TaliaDoGry.add(new Karty("Trefl","Siódemka",7));
            TaliaDoGry.add(new Karty("Trefl","Ósemka",8));
            TaliaDoGry.add(new Karty("Trefl","Dziewiątka",9));
            TaliaDoGry.add(new Karty("Trefl","Dziesiątka",10));
            TaliaDoGry.add(new Karty("Trefl","Walet",2));
            TaliaDoGry.add(new Karty("Trefl","Dama",3));
            TaliaDoGry.add(new Karty("Trefl","Król",4));
            TaliaDoGry.add(new Karty("Trefl","As",11));
            //Piki//
            TaliaDoGry.add(new Karty("Pik","Dwójka",2));
            TaliaDoGry.add(new Karty("Pik","Trójka",3));
            TaliaDoGry.add(new Karty("Pik","Czwórka",4));
            TaliaDoGry.add(new Karty("Pik","Piątka",5));
            TaliaDoGry.add(new Karty("Pik","Szóstka",6));
            TaliaDoGry.add(new Karty("Pik","Siódemka",7));
            TaliaDoGry.add(new Karty("Pik","Ósemka",8));
            TaliaDoGry.add(new Karty("Pik","Dziewiątka",9));
            TaliaDoGry.add(new Karty("Pik","Dziesiątka",10));
            TaliaDoGry.add(new Karty("Pik","Walet",2));
            TaliaDoGry.add(new Karty("Pik","Dama",3));
            TaliaDoGry.add(new Karty("Pik","Król",4));
            TaliaDoGry.add(new Karty("Pik","As",11));
            //Kara//
            TaliaDoGry.add(new Karty("Karo","Dwójka",2));
            TaliaDoGry.add(new Karty("Karo","Trójka",3));
            TaliaDoGry.add(new Karty("Karo","Czwórka",4));
            TaliaDoGry.add(new Karty("Karo","Piątka",5));
            TaliaDoGry.add(new Karty("Karo","Szóstka",6));
            TaliaDoGry.add(new Karty("Karo","Siódemka",7));
            TaliaDoGry.add(new Karty("Karo","Ósemka",8));
            TaliaDoGry.add(new Karty("Karo","Dziewiątka",9));
            TaliaDoGry.add(new Karty("Karo","Dziesiątka",10));
            TaliaDoGry.add(new Karty("Karo","Walet",2));
            TaliaDoGry.add(new Karty("Karo","Dama",3));
            TaliaDoGry.add(new Karty("Karo","Król",4));
            TaliaDoGry.add(new Karty("Karo","As",11));
            //Kiery//
            TaliaDoGry.add(new Karty("Kier","Dwójka",2));
            TaliaDoGry.add(new Karty("Kier","Trójka",3));
            TaliaDoGry.add(new Karty("Kier","Czwórka",4));
            TaliaDoGry.add(new Karty("Kier","Piątka",5));
            TaliaDoGry.add(new Karty("Kier","Szóstka",6));
            TaliaDoGry.add(new Karty("Kier","Siódemka",7));
            TaliaDoGry.add(new Karty("Kier","Ósemka",8));
            TaliaDoGry.add(new Karty("Kier","Dziewiątka",9));
            TaliaDoGry.add(new Karty("Kier","Dziesiątka",10));
            TaliaDoGry.add(new Karty("Kier","Walet",2));
            TaliaDoGry.add(new Karty("Kier","Dama",3));
            TaliaDoGry.add(new Karty("Kier","Król",4));
            TaliaDoGry.add(new Karty("Kier","As",11));
        }
        return TaliaDoGry;
    }
}

public class Main {
    static String directoryProfili = "C:\\Users\\Zibzą77\\Desktop\\";
    static String zalogowanyProfil = "nie zalogowano";
    static boolean isZalogowany=false;
    static int liczbaWygranych=0;
    static int liczbaPrzegranych=0;
    public static void MenuGlowne() throws IOException
    {
        //Zmienne//
        Scanner MyScanner = new Scanner(System.in);
        int Decyzja = 0;

        //Wyświetlanie Menu//
        System.out.println("Co chcesz zrobić?");
        System.out.println("1.Zagraj w grę");
        System.out.println("2.Otworzyć menu profili");
        System.out.println("3.Naucz się zasad");
        System.out.println("4.Wyjść");

        //Decyzja użytkownika//
        do {
            Decyzja = MyScanner.nextInt();
        }while (Decyzja<1||Decyzja>4);

        switch (Decyzja)
        {
            case 1:
                Gra();
                break;

            case 2:
                MenuProfili();
                break;

            case 3:
                Zasady();
                break;

            case 4:
                System.out.println("Dziękujemy bardzo za grę");
                break;
        }

    }

    public static ArrayList<Karty> Dobieranie(ArrayList<Karty> Talia, ArrayList<Karty> Ręka)
    {
        Ręka.add(Talia.get(0));
        Talia.remove(0);
        return Ręka;
    }

    public static String DecyzjaBota(ArrayList<Karty> RekaBota, int IloscPunktow)
    {
        String[] TablicaDecyzji = new String[21];
        String Decyzja = "D";
        Random MyRandom = new Random();

        if(RekaBota.size()!=1) {
            //Zapełnienie Tablicy tak żeby bot dobrał//
            for (int i = 0; i < TablicaDecyzji.length; i++) {
                TablicaDecyzji[i] = "D";
            }

            //Zapełnienie Tablicy tak żeby bot spasował//
            for (int i = 0; i < IloscPunktow; i++) {
                TablicaDecyzji[i] = "P";
            }

            //Wylosowanie Decyzji przez bota//
            int PodjecieDezycji = MyRandom.nextInt(0,TablicaDecyzji.length-1);
            PodjecieDezycji+=1;
            Decyzja=TablicaDecyzji[PodjecieDezycji];
        }
        return Decyzja;
    }

    public static void Gra() throws IOException {
        //Klasy//
        Scanner MyScannner = new Scanner(System.in);
        Karty karty = new Karty();

        //Zmienne//
        int IlośćKart = 0;
        int WartośćRękiGracza = 0;
        int WartośćRękiPrzeciwnika=0;
        String Decyzja;
        String DecyzjaGracza;
        String DecyzjaBota;
        int IlośćKartPrzeciwnika=0;
        int IlośćKartGracza=0;
        ArrayList<Karty> TaliaDoGry = new ArrayList<Karty>();
        ArrayList<Karty> RękaGracza = new ArrayList<Karty>();
        ArrayList<Karty> RękaPrzeciwnika = new ArrayList<>();

        //Tworzenie Talii i wybór poziomu trudności//
        do{
            System.out.println("Z ilu talii chcesz grać? (2/3/4/5)");
            IlośćKart=MyScannner.nextInt();

        }while(IlośćKart<2 || IlośćKart>5);

        karty.TworzenieTalii(IlośćKart,TaliaDoGry);

        //Tasowanie Kart//
        Collections.shuffle(TaliaDoGry);

        //PierwszeRozdanie//
        Dobieranie(TaliaDoGry,RękaGracza);
        System.out.println("Dobrałes kartę "+RękaGracza.get(0).Figura+" "+RękaGracza.get(0).Kolor+" o wartości "+RękaGracza.get(0).Wartosc);
        IlośćKartGracza+=1;
        WartośćRękiGracza = RękaGracza.get(0).Wartosc;
        System.out.println("Wartość twojej ręki wynosi " + WartośćRękiGracza);
        Dobieranie(TaliaDoGry,RękaPrzeciwnika);
        IlośćKartPrzeciwnika+=1;
        WartośćRękiPrzeciwnika = RękaPrzeciwnika.get(0).Wartosc;
        System.out.println("Przeciwnik dobiera kartę");
        System.out.println();

        //PętlaGry//
        do{
            //Decyzja Gracza//
            System.out.println("Chcesz dobrać czy spasować?(D/P)");
            DecyzjaGracza=MyScannner.next().toUpperCase();
            System.out.println();
            if (DecyzjaGracza.equals("D"))
            {
                Dobieranie(TaliaDoGry,RękaGracza);
                System.out.println("Dobrałes kartę "+RękaGracza.get(IlośćKartGracza).Figura+" "+RękaGracza.get(IlośćKartGracza).Kolor+" o wartości "+RękaGracza.get(IlośćKartGracza).Wartosc);
                WartośćRękiGracza+=RękaGracza.get(IlośćKartGracza).Wartosc;
                System.out.println("Wartość twojej ręki wynosi "+WartośćRękiGracza);
                IlośćKartGracza+=1;
            }
            else
            {
                System.out.println("Spasowałeś");
            }
            //Decyzja Bota//
            DecyzjaBota=DecyzjaBota(RękaPrzeciwnika,WartośćRękiPrzeciwnika);
            if(DecyzjaBota.equals("D"))
            {
                Dobieranie(TaliaDoGry,RękaPrzeciwnika);
                System.out.println("Przeciwnik dobiera kartę "+RękaPrzeciwnika.get(IlośćKartPrzeciwnika).Figura+" "+RękaPrzeciwnika.get(IlośćKartPrzeciwnika).Kolor+" o wartości "+RękaPrzeciwnika.get(IlośćKartPrzeciwnika).Wartosc);
                WartośćRękiPrzeciwnika+=RękaPrzeciwnika.get(IlośćKartPrzeciwnika).Wartosc;
                System.out.println("Wartość ręki przeciwnika wynosi " + (WartośćRękiPrzeciwnika-RękaPrzeciwnika.get(0).Wartosc + " i wartość karty z początku"));
                IlośćKartPrzeciwnika+=1;
            }
            else
            {
                System.out.println("Przeciwnik spasował");
            }

            if(WartośćRękiGracza>=21 || WartośćRękiPrzeciwnika>=21)
            {
                System.out.println("Któryś z graczy ma za dużo puntków");
                break;
            }
            System.out.println();
        }while(DecyzjaBota.equals("D") || DecyzjaGracza.equals("D"));

        System.out.println();
        System.out.println("Wartość twojej ręki wynosi "+ WartośćRękiGracza);
        System.out.println("Wartość ręki przeciwnika wynosi " + WartośćRękiPrzeciwnika);
        System.out.println();

        if(WartośćRękiGracza==21||WartośćRękiPrzeciwnika>21)
        {
           System.out.println("Gratulacje wygrałeś");
            if(isZalogowany)
            {
                liczbaWygranych++;
            }
        }
        else if(WartośćRękiPrzeciwnika==21||WartośćRękiGracza>21)
        {
            System.out.println("Przykro mi ale przegrałeś");
            if(isZalogowany)
            {
                liczbaPrzegranych++;
            }
        }
        else if(WartośćRękiGracza>WartośćRękiPrzeciwnika)
        {
          System.out.println("Gratulacje wygrałeś");
          if(isZalogowany)
          {
              liczbaWygranych++;
          }
        }
        else
        {
            System.out.println("Przykro mi ale przegrałeś");
            if(isZalogowany)
            {
                liczbaPrzegranych++;
            }
        }

        System.out.println("Czy chcesz już wrocić do menu głównego? (T/N)");
        Decyzja = MyScannner.next().toUpperCase();

        if(Decyzja.equals("T"))
        {
            MenuGlowne();
        }

    }

    public static void Zasady() throws IOException
    {
        //Klasy//
        File file = new File("C:\\Users\\Zibzą77\\Desktop\\Programowanie Java\\Ćwiczenia\\ZasadyGryOczko.txt");
        BufferedReader MyBufferedReader = new BufferedReader(new FileReader(file));
        Scanner MyScanner = new Scanner(System.in);

        //Zmienne//
        String Słowo;
        String Decyzja;

        //Wyświetlanie//
        while((Słowo=MyBufferedReader.readLine())!=null)
        {
            System.out.println(Słowo);
        }

        //Powrót do menu głównego//
            System.out.println("Czy chcesz już wrocić do menu głównego? (T/N)");
            Decyzja = MyScanner.next().toUpperCase();

            if(Decyzja.equals("T"))
            {
              MenuGlowne();
            }
    }
    public static void MenuProfili() throws IOException
    {
        //Klasy//
        Scanner MyScanner = new Scanner(System.in);

        //Zmienne//
        int Decyzja=0;

        //Wyświetlanie Menu//
        System.out.println("Co chcesz zrobić?");
        System.out.println("1.Stworzyć nowy profil");
        System.out.println("2.Zalogować się do profilu");
        System.out.println("3.Zapisać stan profilu");
        System.out.println("4.Zobaczyć statystyki zalogowanego profilu");
        System.out.println("5.Wyjść do menu głównego");

        //Decyzja użytkownika//
        do {
            Decyzja = MyScanner.nextInt();
        }while (Decyzja<1||Decyzja>5);

        switch (Decyzja)
        {
            case 1:
                StworzProfil();
                break;

            case 2:
                ZalogujDoProfilu();
                break;

            case 3:
                ZapiszDoProfilu();
                break;

            case 4:
                PokazStatystykiProfilu();
                break;

            case 5:
                MenuGlowne();
                break;
        }
    }
    public static void ZalogujDoProfilu() throws IOException
    {
        //klasy//
        Scanner MyScanner = new Scanner(System.in);
        BufferedReader reader;
        File plikProfilu;

        //zmienne//
        String nazwaProfilu;
        int wygraneZPliku=0;
        int przegraneZPliku=0;

        //zczytanie nazwy profilu
        System.out.println("Wpisz imie i nazwisko profilu na który chcesz się zalogować");
        nazwaProfilu = MyScanner.nextLine();
        nazwaProfilu = nazwaProfilu.replaceAll("\\s","");
        plikProfilu = new File(directoryProfili+nazwaProfilu+".txt");

        if (plikProfilu.exists())
        {   //jeśli istnieje, sczytujemy dane z pliku
            zalogowanyProfil = nazwaProfilu;
            reader = new BufferedReader(new FileReader(plikProfilu));
            String[] tempTekstZPliku = reader.readLine().split(" ");
            liczbaWygranych = Integer.parseInt(tempTekstZPliku[1]);
            tempTekstZPliku = reader.readLine().split(" ");
            liczbaPrzegranych =Integer.parseInt(tempTekstZPliku[1]);
            isZalogowany = true;
            reader.close();
        }
        else
        {   //jeśli nie istnieje, pytamy użytkownika co dalej
            System.out.println("nie znaleziono profilu, wpisz odpowiednią liczbę jesli chcesz:");
            System.out.println("1.wyszukać nowy profil");
            System.out.println("2.wrócić do menu");
            int Decyzja = MyScanner.nextInt();
            do{
                switch(Decyzja) {
                    case 1:
                        ZalogujDoProfilu();
                        break;
                    case 2:
                        MenuGlowne();
                        break;
                }
            }while(Decyzja < 1 || Decyzja>2);
        }
        MenuGlowne();
    }
    public static void ZalogujDoProfilu(String nazwaProfilu) throws IOException
    {
        //klasy//
        Scanner MyScanner = new Scanner(System.in);
        BufferedReader reader;
        File plikProfilu;

        //zmienne//
        int wygraneZPliku=0;
        int przegraneZPliku=0;
        String[] tempTekstZPliku;

        plikProfilu = new File(directoryProfili+nazwaProfilu+".txt");
        zalogowanyProfil = nazwaProfilu;
        reader = new BufferedReader(new FileReader(plikProfilu));
        tempTekstZPliku = reader.readLine().split(" ");
        liczbaWygranych += Integer.parseInt(tempTekstZPliku[1]);
        tempTekstZPliku = reader.readLine().split(" ");
        liczbaPrzegranych +=Integer.parseInt(tempTekstZPliku[1]);
        isZalogowany = true;
        reader.close();
        MenuGlowne();
    }
    static void ZapiszDoProfilu() throws IOException
    {
        //klasy//
        Scanner MyScanner = new Scanner(System.in);
        BufferedWriter writer;
        //zamiast pytać użytkownika o nazwe profilu używamy zmiennej zadeklarowanej w klasie Main
        File plikProfilu = new File(directoryProfili+zalogowanyProfil+".txt");

        //zmienne//

        if(plikProfilu.exists())
        {
            //jeśli istnieje zapisujemy
            writer = new BufferedWriter(new FileWriter(plikProfilu));
            writer.write("wygrane: " + liczbaWygranych + "\n");
            writer.write("przegrane: " + liczbaPrzegranych);
            writer.close();
        }
        else
        {
            //jeśli nie, wyświetlam komunikat o błędzie
            System.out.println("nie odnaleziono pliku w ścieżce: "+directoryProfili);
        }
        MenuProfili();
    }
    static void StworzProfil() throws IOException
    {
        //klasy//
        Scanner MyScanner = new Scanner(System.in);
        BufferedWriter writer;
        File plikProfilu;

        //zmienne//
        String nazwaProfilu;
        String Decyzja;

        System.out.println("Wpisz imie i nazwisko profilu który chcesz stworzyć");
        nazwaProfilu = MyScanner.nextLine();
        nazwaProfilu = nazwaProfilu.replaceAll("\\s","");
        plikProfilu = new File(directoryProfili+nazwaProfilu+".txt");
        if (plikProfilu.exists())
        {
            System.out.println("Profil już istnieje");
            System.out.println("Czy chcesz się do niego zalogować? (T/N)");
            do {
                Decyzja = MyScanner.next().toUpperCase();
            }while (!Decyzja.equals("T")||!Decyzja.equals("N"));
            if (Decyzja.equals("T"))
            {
                ZalogujDoProfilu(nazwaProfilu);
            }
            else if (Decyzja.equals("N"))
            {
                MenuProfili();
            }
        }
        else
        {
            writer = new BufferedWriter(new FileWriter(plikProfilu));
            writer.write("wygrane: 0");
            writer.newLine();
            writer.write("przegrane: 0");
            writer.close();
        }
        MenuGlowne();
    }
    public static void PokazStatystykiProfilu() throws IOException
    {
        //klasy
        Scanner MyScanner = new Scanner(System.in);

        //zmienne
        String[] tempTekstZPliku;
        String decyzja;

        //sprawdzamy czy wogóle jesteśmy zalogowani
        if (isZalogowany)
        {   //jeśli tak, zczytujemy dane z zalogowanego profilu
            System.out.println("Statystyki dla profilu \""+zalogowanyProfil+"\"");
            System.out.println("wygrane: "+liczbaWygranych);
            System.out.println("przegrane: "+liczbaPrzegranych);
            System.out.println("ilość zagranych partii "+(liczbaWygranych+liczbaPrzegranych));
            System.out.println();
        }
        else
        {
            System.out.println("Nie jesteś zalogowany do żadnego profilu");
            System.out.println("Czy chcesz się teraz zalogowac?(T/N)");
            do {
                decyzja = MyScanner.next().toUpperCase();
            }while (!decyzja.equals("T")||!decyzja.equals("N"));
            if (decyzja.equals("T"))
            {
                ZalogujDoProfilu();
            }
            else if (decyzja.equals("N"))
            {
                MenuProfili();
            }
        }
        MenuProfili();
    }
    public static void main(String[] args) throws IOException
    {
        MenuGlowne();
    }
}
