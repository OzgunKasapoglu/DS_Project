package Football_Project;

public class DataInitializer {
    Team[] teams = new Team[3];
    Team galatasaray = new Team("Galatasaray", 1);
    Team fenerbahce = new Team("Fenerbahce", 2);
    Team besiktas = new Team("Besiktaş JK", 3);
    Team tottenham = new Team("Tottenham Hotspur", 4);
    Team bilbao = new Team("Athletic Bilbao", 5);
    Team frankfurt = new Team("Eintracht Frankfurt", 6);
    Team roma = new Team("AS Roma", 7);
    Team lyon = new Team("Olympique Lyon", 8);
    Team nice = new Team("OGC Nice", 9);
    Team prag = new Team("SK Slavia Prag", 10);
    Team anderlecht = new Team("RSC Anderlecht", 11);
    Team paok = new Team("PAOK", 12);
    Team Midtjylland = new Team("FC Midtjylland", 13);
    Team gilloise = new Team("Union Saint-Gilloise", 14);
    Team twente = new Team("FC Twente Enschede", 15);
    Team plzen = new Team("FC Viktoria Plzen", 16);
    Team razgrad = new Team("Ludogorets Razgrad", 17);
    Team glint = new Team("Glint", 18);
    Team elfsborg = new Team("IF Elfsborg", 19);
    Team karabag = new Team("Qarabağ FK", 20);
    Team rfs = new Team("FC RFS", 21);
    Team manu = new Team("Manchester United", 22);
    Team sociedad = new Team("Real Sociedad", 23);
    Team porto = new Team("FC Porto", 24);
    Team lazio = new Team("SS Lazio", 25);
    Team ajax = new Team("Ajax Amsterdam", 26);
    Team hoffenheim = new Team("TSG 1899 Hoffenheim", 27);
    Team braga = new Team("SC Braga", 28);
    Team olympiacos = new Team("Olympiacos", 29);
    Team kiev = new Team("Dynamo Kiev", 30);
    Team rangers = new Team("Glasgov Rangers", 31);
    Team alkmaar = new Team("AZ Alkmaar", 32);
    Team ferencvaros = new Team("Ferencvaros", 33);
    Team fcsb = new Team("FCSB", 34);
    Team malmo = new Team("Malmö FF", 35);
    Team telaviv = new Team("Maccabi Tel Aviv", 36);

    //Galatasaray
    Player muslera = new Player("Fernando Muslera", 1, "Goalkeeper");
    Player ayhan = new Player("Kaan Ayhan", 23, "Defender");
    Player sanchez = new Player("Davinson Sánchez", 6, "Defender");
    Player nelsson = new Player("Victor Nelsson", 25, "Defender");
    Player yilmaz = new Player("Barış Alper Yılmaz", 53, "Defender");
    Player mertens = new Player("Dries Mertens", 10, "Midfielder");
    Player torreira = new Player("Lucas Torreira", 34, "Midfielder");
    Player sara = new Player("Gabriel Sara", 20, "Midfielder");
    Player akgun = new Player("Yunus Akgün", 11, "Midfielder");
    Player osimhen = new Player("Victor Osimhen", 45, "Forward");
    Player icardi = new Player("Mauro Icardi", 9, "Forward");

    //Fenerbahce
    Player livakovic = new Player("Dominik Livakovic", 40, "Goalkeeper");
    Player müldür = new Player("Mert Müldür", 16, "Defender");
    Player söyüncü = new Player("Çağlar Söyüncü", 4, "Defender");
    Player djiku = new Player("Alexander Djiku", 23, "Defender");
    Player oosterwolde = new Player("Jayden Oosterwolde", 12, "Defender");
    Player amrabat = new Player("Sofyan Amrabat", 34, "Midfielder");
    Player fred = new Player("Fred", 13, "Midfielder");
    Player szymanski = new Player("Sebastian Szymański", 53, "Midfielder");
    Player ünder = new Player("Cengiz Ünder", 17, "Forward");
    Player saint_maximin = new Player("Allan Saint-Maximin", 97, "Forward");
    Player dzeko = new Player("Edin Džeko", 9, "Forward");

    //Besiktas
    Player gunok = new Player("Mert Günok", 34, "Goalkeeper");
    Player uduokhai = new Player("Felix Uduokhai", 14, "Defender");
    Player paulista = new Player("Gabriel Paulista", 3, "Defender");
    Player keleş = new Player("Can Keleş", 27, "Defender");
    Player topçu = new Player("Emirhan Topçu", 5, "Defender");
    Player ndour = new Player("Cher Ndour", 8, "Midfielder");
    Player almusrati = new Player("Al-Musrati", 6, "Midfielder");
    Player silva = new Player("Rafa Silva", 18, "Midfielder");
    Player mario = new Player("João Mário", 20, "Midfielder");
    Player immobile = new Player("Ciro Immobile", 17, "Forward");
    Player akgün = new Player("Oğuzhan Akgün", 11, "Forward");

    // Tottenham
    Player vicario = new Player("Guglielmo Vicario", 1, "Goalkeeper");
    Player porro = new Player("Pedro Porro", 23, "Defender");
    Player romero = new Player("Cristian Romero", 17, "Defender");
    Player vanDeVen = new Player("Micky van de Ven", 37, "Defender");
    Player udogie = new Player("Destiny Udogie", 13, "Defender");
    Player bissouma = new Player("Yves Bissouma", 8, "Midfielder");
    Player maddison = new Player("James Maddison", 10, "Midfielder");
    Player sarr = new Player("Pape Matar Sarr", 29, "Midfielder");
    Player kulusevski = new Player("Dejan Kulusevski", 21, "Forward");
    Player son = new Player("Son Heung-min", 7, "Forward");
    Player richarlison = new Player("Richarlison", 9, "Forward");

    //Atletic Bilbao
    Player simon = new Player("Unai Simón", 1, "Goalkeeper");
    Player deMarcos = new Player("Óscar de Marcos", 18, "Defender");
    Player yeray = new Player("Yeray Álvarez", 5, "Defender");
    Player vivian = new Player("Dani Vivian", 3, "Defender");
    Player berchiche = new Player("Yuri Berchiche", 17, "Defender");
    Player vesga = new Player("Mikel Vesga", 6, "Midfielder");
    Player garcia = new Player("Raúl García", 22, "Midfielder");
    Player sancet = new Player("Oihan Sancet", 8, "Midfielder");
    Player williams = new Player("Iñaki Williams", 9, "Forward");
    Player nicoWilliams = new Player("Nico Williams", 11, "Forward");
    Player guruzeta = new Player("Gorka Guruzeta", 12, "Forward");

    //Eintracht Frankfurt
    Player santos = new Player("Kauã Santos", 40, "Goalkeeper");
    Player kristensen = new Player("Rasmus Kristensen", 2, "Defender");
    Player koch = new Player("Robin Koch", 4, "Defender");
    Player theate = new Player("Arthur Theate", 14, "Defender");
    Player collins = new Player("Levi Colwill", 3, "Defender");
    Player skhiri = new Player("Ellyes Skhiri", 6, "Midfielder");
    Player hojilund = new Player("Oscar Højlund", 19, "Midfielder");
    Player chaibi = new Player("Fares Chaïbi", 8, "Midfielder");
    Player brown = new Player("Jacob Brown", 11, "Midfielder");
    Player marmoush = new Player("Omar Marmoush", 7, "Forward");
    Player ekitike = new Player("Hugo Ekitiké", 9, "Forward");

    // AS Roma
    Player patricio = new Player("Rui Patrício", 1, "Goalkeeper");
    Player mancini = new Player("Gianluca Mancini", 23, "Defender");
    Player llorente = new Player("Diego Llorente", 14, "Defender");
    Player ibanez = new Player("Roger Ibañez", 3, "Defender");
    Player spinazzola = new Player("Leonardo Spinazzola", 37, "Defender");
    Player cristante = new Player("Bryan Cristante", 4, "Midfielder");
    Player pellegrini = new Player("Lorenzo Pellegrini", 7, "Midfielder");
    Player aouar = new Player("Houssem Aouar", 22, "Midfielder");
    Player dybala = new Player("Paulo Dybala", 21, "Forward");
    Player belotti = new Player("Andrea Belotti", 9, "Forward");
    Player lukaku = new Player("Romelu Lukaku", 90, "Forward");

    // Lyon
    Player lopez = new Player("Anthony Lopes", 1, "Goalkeeper");
    Player kumbedi = new Player("Saël Kumbedi", 20, "Defender");
    Player lukeba = new Player("Castello Lukeba", 4, "Defender");
    Player lovren = new Player("Dejan Lovren", 5, "Defender");
    Player tagliafico = new Player("Nicolás Tagliafico", 3, "Defender");
    Player caqueret = new Player("Maxence Caqueret", 6, "Midfielder");
    Player toliso = new Player("Corentin Tolisso", 8, "Midfielder");
    Player lepenant = new Player("Johann Lepenant", 24, "Midfielder");
    Player cherki = new Player("Rayan Cherki", 18, "Forward");
    Player lacazette = new Player("Alexandre Lacazette", 10, "Forward");
    Player barcola = new Player("Bradley Barcola", 26, "Forward");

    // OGC Nice
    Player bulka = new Player("Marcin Bułka", 1, "Goalkeeper");
    Player atal = new Player("Youcef Atal", 20, "Defender");
    Player dante = new Player("Dante", 4, "Defender");
    Player todibo = new Player("Jean-Clair Todibo", 25, "Defender");
    Player bard = new Player("Melvin Bard", 26, "Defender");
    Player thuram = new Player("Khéphren Thuram", 19, "Midfielder");
    Player boudaoui = new Player("Hicham Boudaoui", 28, "Midfielder");
    Player ramsey = new Player("Aaron Ramsey", 16, "Midfielder");
    Player laborde = new Player("Gaëtan Laborde", 24, "Forward");
    Player moffi = new Player("Terem Moffi", 9, "Forward");
    Player pepeN = new Player("Nicolas Pépé", 29, "Forward");

    // SK Slavia Prag
    Player mandous = new Player("Aleš Mandous", 28, "Goalkeeper");
    Player bah = new Player("Alexander Bah", 5, "Defender");
    Player holeš = new Player("Tomáš Holeš", 3, "Defender");
    Player ogbu = new Player("Igoh Ogbu", 4, "Defender");
    Player dorley = new Player("Oscar Dorley", 19, "Defender");
    Player ševčík = new Player("Petr Ševčík", 23, "Midfielder");
    Player traoré = new Player("Ibrahim Traoré", 27, "Midfielder");
    Player lingr = new Player("Ondřej Lingr", 32, "Midfielder");
    Player masopust = new Player("Lukáš Masopust", 28, "Forward");
    Player tecl = new Player("Stanislav Tecl", 11, "Forward");
    Player schranz = new Player("Ivan Schranz", 26, "Forward");

    // RSC Anderlecht
    Player verbruggen = new Player("Bart Verbruggen", 16, "Goalkeeper");
    Player murillo = new Player("Michael Murillo", 62, "Defender");
    Player debast = new Player("Zeno Debast", 56, "Defender");
    Player vertonghen = new Player("Jan Vertonghen", 14, "Defender");
    Player delcroix = new Player("Hannes Delcroix", 3, "Defender");
    Player arnstad = new Player("Kristian Arnstad", 61, "Midfielder");
    Player trebel = new Player("Adrien Trebel", 25, "Midfielder");
    Player ashimeru = new Player("Majeed Ashimeru", 18, "Midfielder");
    Player amuzu = new Player("Francis Amuzu", 7, "Forward");
    Player esposito = new Player("Sebastiano Esposito", 70, "Forward");
    Player stroeykens = new Player("Mario Stroeykens", 29, "Forward");

    // PAOK
    Player kotarski = new Player("Dominik Kotarski", 1, "Goalkeeper");
    Player vieirinha = new Player("Vieirinha", 20, "Defender");
    Player ingason = new Player("Sverrir Ingi Ingason", 4, "Defender");
    Player crespo = new Player("José Ángel Crespo", 15, "Defender");
    Player rafaSoares = new Player("Rafa Soares", 5, "Defender");
    Player schwab = new Player("Stefan Schwab", 22, "Midfielder");
    Player kurtic = new Player("Jasmin Kurtić", 27, "Midfielder");
    Player misic = new Player("Josip Mišić", 8, "Midfielder");
    Player zivkovic = new Player("Andrija Živković", 14, "Forward");
    Player olivera = new Player("Nelson Oliveira", 18, "Forward");
    Player akpom = new Player("Chuba Akpom", 47, "Forward");

    // FC Midtjylland
    Player loessl = new Player("Jonas Lössl", 1, "Goalkeeper");
    Player andersson = new Player("Henrik Dalsgaard", 14, "Defender");
    Player sviatchenko = new Player("Erik Sviatchenko", 28, "Defender");
    Player juninho = new Player("Juninho", 5, "Defender");
    Player paulinho = new Player("Paulinho", 29, "Defender");
    Player evander = new Player("Evander", 10, "Midfielder");
    Player onyedika = new Player("Raphael Onyedika", 37, "Midfielder");
    Player dreyer = new Player("Anders Dreyer", 36, "Midfielder");
    Player isaksen = new Player("Gustav Isaksen", 45, "Forward");
    Player brumado = new Player("Júnior Brumado", 74, "Forward");
    Player kraev = new Player("Bozhidar Kraev", 7, "Forward");

    // Union Saint-Gilloise
    Player moris = new Player("Anthony Moris", 49, "Goalkeeper");
    Player nieuwkoop = new Player("Bart Nieuwkoop", 2, "Defender");
    Player van_der_heyden = new Player("Christian Burgess", 16, "Defender");
    Player bager = new Player("Ismaël Kandouss", 59, "Defender");
    Player lapoussin = new Player("Loïc Lapoussin", 94, "Defender");
    Player lynen = new Player("Senne Lynen", 20, "Midfielder");
    Player teuma = new Player("Teddy Teuma", 17, "Midfielder");
    Player lazare = new Player("Jean Thierry Lazare", 8, "Midfielder");
    Player boniface = new Player("Victor Boniface", 7, "Forward");
    Player vanzeir = new Player("Dante Vanzeir", 13, "Forward");
    Player adingra = new Player("Simon Adingra", 11, "Forward");

    // FC Twente Enschede
    Player unnerstall = new Player("Lars Unnerstall", 1, "Goalkeeper");
    Player bruns = new Player("Mees Hilgers", 2, "Defender");
    Player pierie = new Player("Kik Pierie", 3, "Defender");
    Player propper = new Player("Robin Pröpper", 4, "Defender");
    Player smal = new Player("Gijs Smal", 5, "Defender");
    Player zerrouki = new Player("Ramiz Zerrouki", 6, "Midfielder");
    Player sadilek = new Player("Michal Sadílek", 8, "Midfielder");
    Player vlap = new Player("Michel Vlap", 10, "Midfielder");
    Player cerny = new Player("Vaclav Cerny", 7, "Forward");
    Player ricky = new Player("Ricky van Wolfswinkel", 9, "Forward");
    Player misidjan = new Player("Virgil Misidjan", 11, "Forward");

    // FC Viktoria Plzen
    Player stanek = new Player("Jindřich Staněk", 36, "Goalkeeper");
    Player hejda = new Player("Lukáš Hejda", 2, "Defender");
    Player pernica = new Player("Jakub Brabec", 22, "Defender");
    Player havel = new Player("Milan Havel", 24, "Defender");
    Player mosquera = new Player("Radim Řezník", 14, "Defender");
    Player kalvach = new Player("Lukáš Kalvach", 23, "Midfielder");
    Player buchta = new Player("Pavel Bucha", 20, "Midfielder");
    Player cermak = new Player("Aleš Čermák", 25, "Midfielder");
    Player chorý = new Player("Tomáš Chorý", 15, "Forward");
    Player mosqueraJ = new Player("Jhon Mosquera", 18, "Forward");
    Player baLoua = new Player("Adriel Ba Loua", 77, "Forward");

    // Ludogorets Razgrad
    Player puscas = new Player("Giedrius Arlauskis", 1, "Goalkeeper");
    Player cicinho = new Player("Cicinho", 4, "Defender");
    Player verdon = new Player("Olivier Verdon", 24, "Defender");
    Player terziev = new Player("Georgi Terziev", 5, "Defender");
    Player nedyalkov = new Player("Anton Nedyalkov", 3, "Defender");
    Player dyakov = new Player("Svetoslav Dyakov", 18, "Midfielder");
    Player badji = new Player("Stéphane Badji", 25, "Midfielder");
    Player santana = new Player("Alex Santana", 7, "Midfielder");
    Player despodov = new Player("Kiril Despodov", 11, "Forward");
    Player sotiriou = new Player("Pieros Sotiriou", 19, "Forward");
    Player tekpetey = new Player("Bernard Tekpetey", 37, "Forward");

    // Glint
    Player horvath = new Player("Ethan Horvath", 1, "Goalkeeper");
    Player arteaga = new Player("Gerardo Arteaga", 5, "Defender");
    Player cuestas = new Player("Carlos Cuesta", 46, "Defender");
    Player mckenzie = new Player("Mark McKenzie", 2, "Defender");
    Player muñoz = new Player("Daniel Muñoz", 23, "Defender");
    Player heyden = new Player("Bryan Heynen", 8, "Midfielder");
    Player thorstvedt = new Player("Kristian Thorstvedt", 42, "Midfielder");
    Player tresor = new Player("Mike Trésor", 11, "Midfielder");
    Player onuachu = new Player("Paul Onuachu", 18, "Forward");
    Player paintsil = new Player("Joseph Paintsil", 28, "Forward");
    Player bongonda = new Player("Théo Bongonda", 10, "Forward");

    // IF Elfsborg
    Player ronn = new Player("Tim Rönning", 1, "Goalkeeper");
    Player larsson = new Player("Johan Larsson", 24, "Defender");
    Player holst = new Player("Frederik Holst", 27, "Defender");
    Player okumu = new Player("Joseph Okumu", 4, "Defender");
    Player strand = new Player("Simon Strand", 13, "Defender");
    Player olsson = new Player("Robert Gojani", 6, "Midfielder");
    Player frick = new Player("Per Frick", 17, "Midfielder");
    Player holmen = new Player("Samuel Holmén", 8, "Midfielder");
    Player ondrejka = new Player("Jacob Ondrejka", 19, "Forward");
    Player alm = new Player("Rasmus Alm", 10, "Forward");
    Player bernhardsson = new Player("Jeppe Okkels", 7, "Forward");

    // Qarabağ FK
    Player begovic = new Player("Asmir Begović", 1, "Goalkeeper");
    Player medvedev = new Player("Maksim Medvedev", 5, "Defender");
    Player huseynov = new Player("Rashad Sadygov", 14, "Defender");
    Player garayev = new Player("Qara Qarayev", 2, "Defender");
    Player agolli = new Player("Ansi Agolli", 6, "Defender");
    Player richard = new Player("Richard Almeida", 20, "Midfielder");
    Player michel = new Player("Michel", 8, "Midfielder");
    Player quintana = new Player("Dani Quintana", 10, "Midfielder");
    Player zoubir = new Player("Abdellah Zoubir", 11, "Forward");
    Player emreli = new Player("Mahir Emreli", 9, "Forward");
    Player romeroJ = new Player("Jaime Romero", 7, "Forward");

    // FC RFS
    Player steinbors = new Player("Pāvels Šteinbors", 1, "Goalkeeper");
    Player jagodinskis = new Player("Vitālijs Jagodinskis", 4, "Defender");
    Player savalnieks = new Player("Roberts Savaļnieks", 2, "Defender");
    Player stuglis = new Player("Kārlis Štāls", 5, "Defender");
    Player solovjovs = new Player("Aleksandrs Solovjovs", 3, "Defender");
    Player simkovic = new Player("Tomáš Šimkovič", 8, "Midfielder");
    Player lipuscek = new Player("Žan Lipušček", 6, "Midfielder");
    Player klešniks = new Player("Artūrs Zjuzins", 10, "Midfielder");
    Player iliev = new Player("Dāvis Ikaunieks", 7, "Forward");
    Player rakels = new Player("Deniss Rakels", 9, "Forward");
    Player bilinski = new Player("Maksims Uvarenko", 11, "Forward");

    // Manchester United
    Player onana = new Player("André Onana", 24, "Goalkeeper");
    Player dalot = new Player("Diogo Dalot", 20, "Defender");
    Player varane = new Player("Raphaël Varane", 19, "Defender");
    Player martinez = new Player("Lisandro Martínez", 6, "Defender");
    Player shaw = new Player("Luke Shaw", 23, "Defender");
    Player casemiro = new Player("Casemiro", 18, "Midfielder");
    Player fernandes = new Player("Bruno Fernandes", 8, "Midfielder");
    Player eriksen = new Player("Christian Eriksen", 14, "Midfielder");
    Player rashford = new Player("Marcus Rashford", 10, "Forward");
    Player martial = new Player("Anthony Martial", 9, "Forward");
    Player sancho = new Player("Jadon Sancho", 25, "Forward");

    // Real Sociedad
    Player remiro = new Player("Álex Remiro", 1, "Goalkeeper");
    Player gorosabel = new Player("Andoni Gorosabel", 18, "Defender");
    Player le_normand = new Player("Robin Le Normand", 24, "Defender");
    Player zubeldia = new Player("Igor Zubeldia", 5, "Defender");
    Player rico = new Player("Diego Rico", 15, "Defender");
    Player merino = new Player("Mikel Merino", 8, "Midfielder");
    Player zubimendi = new Player("Martín Zubimendi", 3, "Midfielder");
    Player silvaD = new Player("David Silva", 21, "Midfielder");
    Player oyarzabal = new Player("Mikel Oyarzabal", 10, "Forward");
    Player sorloth = new Player("Alexander Sørloth", 23, "Forward");
    Player isak = new Player("Alexander Isak", 19, "Forward");

    // FC Porto
    Player costa = new Player("Diogo Costa", 99, "Goalkeeper");
    Player marioJ = new Player("João Mário", 23, "Defender");
    Player pepe = new Player("Pepe", 3, "Defender");
    Player cardoso = new Player("David Carmo", 4, "Defender");
    Player wendell = new Player("Wendell", 22, "Defender");
    Player uribe = new Player("Mateus Uribe", 8, "Midfielder");
    Player otavio = new Player("Otávio", 25, "Midfielder");
    Player eustaquio = new Player("Stephen Eustáquio", 46, "Midfielder");
    Player taremi = new Player("Mehdi Taremi", 9, "Forward");
    Player evanilson = new Player("Evanilson", 30, "Forward");
    Player galeno = new Player("Galeno", 13, "Forward");

    // SS Lazio
    Player provedel = new Player("Ivan Provedel", 94, "Goalkeeper");
    Player marusic = new Player("Adam Marušić", 77, "Defender");
    Player romagnoli = new Player("Alessio Romagnoli", 13, "Defender");
    Player casale = new Player("Nicolò Casale", 15, "Defender");
    Player hysaj = new Player("Elseid Hysaj", 23, "Defender");
    Player cataldi = new Player("Danilo Cataldi", 32, "Midfielder");
    Player alberto = new Player("Luis Alberto", 10, "Midfielder");
    Player anderson = new Player("Felipe Anderson", 7, "Midfielder");
    Player immobileC = new Player("Ciro Immobile", 17, "Forward");
    Player zaccagni = new Player("Mattia Zaccagni", 20, "Forward");
    Player pedro = new Player("Pedro", 9, "Forward");

    // Ajax Amsterdam
    Player gorter = new Player("Jay Gorter", 1, "Goalkeeper");
    Player sanchezJ = new Player("Jorge Sánchez", 19, "Defender");
    Player timber = new Player("Jurriën Timber", 2, "Defender");
    Player bassi = new Player("Calvin Bassey", 3, "Defender");
    Player wijndal = new Player("Owen Wijndal", 5, "Defender");
    Player taylor = new Player("Kenneth Taylor", 8, "Midfielder");
    Player alvarez = new Player("Edson Álvarez", 4, "Midfielder");
    Player berghuis = new Player("Steven Berghuis", 23, "Midfielder");
    Player tadic = new Player("Dušan Tadić", 10, "Forward");
    Player brobbey = new Player("Brian Brobbey", 9, "Forward");
    Player bergwijn = new Player("Steven Bergwijn", 7, "Forward");

    // TSG 1899 Hoffenheim
    Player baumann = new Player("Oliver Baumann", 1, "Goalkeeper");
    Player kabak = new Player("Ozan Kabak", 4, "Defender");
    Player vogt = new Player("Kevin Vogt", 22, "Defender");
    Player akpoguma = new Player("Kevin Akpoguma", 25, "Defender");
    Player angelino = new Player("Angeliño", 11, "Defender");
    Player geiger = new Player("Dennis Geiger", 8, "Midfielder");
    Player promel = new Player("Grischa Prömel", 6, "Midfielder");
    Player kramaric = new Player("Andrej Kramarić", 27, "Midfielder");
    Player bebu = new Player("Ihlas Bebou", 9, "Forward");
    Player dabbur = new Player("Munas Dabbur", 10, "Forward");
    Player rutter = new Player("Georginio Rutter", 33, "Forward");

    // SC Braga
    Player matheus = new Player("Matheus", 1, "Goalkeeper");
    Player fabiano = new Player("Fabiano", 70, "Defender");
    Player tormena = new Player("Vítor Tormena", 3, "Defender");
    Player niakate = new Player("Sikou Niakaté", 4, "Defender");
    Player sequeira = new Player("Nuno Sequeira", 5, "Defender");
    Player al_musrati = new Player("Al Musrati", 8, "Midfielder");
    Player castro = new Player("André Castro", 88, "Midfielder");
    Player horta = new Player("Ricardo Horta", 21, "Midfielder");
    Player ruiz = new Player("Abel Ruiz", 9, "Forward");
    Player banzar = new Player("Simon Banza", 23, "Forward");
    Player medeiros = new Player("Iuri Medeiros", 45, "Forward");

    // Olympiacos
    Player paschalakis = new Player("Alexandros Paschalakis", 1, "Goalkeeper");
    Player rodinei = new Player("Rodinei", 13, "Defender");
    Player ba = new Player("Ousseynou Ba", 24, "Defender");
    Player reabciuk = new Player("Oleg Reabciuk", 45, "Defender");
    Player papastathopoulos = new Player("Sokratis Papastathopoulos", 19, "Defender");
    Player camara = new Player("Mady Camara", 4, "Midfielder");
    Player biel = new Player("Pep Biel", 21, "Midfielder");
    Player fortounis = new Player("Kostas Fortounis", 7, "Midfielder");
    Player el_arabi = new Player("Youssef El-Arabi", 11, "Forward");
    Player masouras = new Player("Giorgos Masouras", 14, "Forward");
    Player bakambu = new Player("Cédric Bakambu", 17, "Forward");

    // Dynamo Kiev
    Player bushchan = new Player("Georgiy Bushchan", 1, "Goalkeeper");
    Player tymchyk = new Player("Oleksandr Tymchyk", 24, "Defender");
    Player zabarnyi = new Player("Illia Zabarnyi", 25, "Defender");
    Player syrota = new Player("Oleksandr Syrota", 34, "Defender");
    Player karavaev = new Player("Oleksandr Karavaev", 20, "Defender");
    Player sydorchuk = new Player("Serhiy Sydorchuk", 5, "Midfielder");
    Player shaparenko = new Player("Mykola Shaparenko", 10, "Midfielder");
    Player buyalskyi = new Player("Vitaliy Buyalskyi", 29, "Midfielder");
    Player tsigankov = new Player("Viktor Tsygankov", 15, "Forward");
    Player besedin = new Player("Artem Besedin", 41, "Forward");
    Player verbic = new Player("Benjamin Verbic", 7, "Forward");

    // Glasgow Rangers
    Player mclaughlin = new Player("Jon McLaughlin", 33, "Goalkeeper");
    Player tavernier = new Player("James Tavernier", 2, "Defender");
    Player goldson = new Player("Connor Goldson", 6, "Defender");
    Player helander = new Player("Filip Helander", 5, "Defender");
    Player barisic = new Player("Borna Barišić", 31, "Defender");
    Player davis = new Player("Steven Davis", 10, "Midfielder");
    Player kamara = new Player("Glen Kamara", 18, "Midfielder");
    Player arfield = new Player("Scott Arfield", 37, "Midfielder");
    Player kent = new Player("Ryan Kent", 14, "Forward");
    Player morelos = new Player("Alfredo Morelos", 20, "Forward");
    Player roofe = new Player("Kemar Roofe", 25, "Forward");

    // AZ Alkmaar
    Player ryan = new Player("Mathew Ryan", 1, "Goalkeeper");
    Player sugawara = new Player("Yukinari Sugawara", 2, "Defender");
    Player beukema = new Player("Sam Beukema", 3, "Defender");
    Player hadzi = new Player("Zinho Vanheusden", 4, "Defender");
    Player kerkez = new Player("Milos Kerkez", 5, "Defender");
    Player deWit = new Player("Dani de Wit", 10, "Midfielder");
    Player reijnders = new Player("Tijjani Reijnders", 6, "Midfielder");
    Player clasie = new Player("Jordy Clasie", 8, "Midfielder");
    Player pavlidis = new Player("Vangelis Pavlidis", 9, "Forward");
    Player odgaard = new Player("Jens Odgaard", 7, "Forward");
    Player karlsson = new Player("Jesper Karlsson", 11, "Forward");

    // Ferencvaros
    Player dibusz = new Player("Dénes Dibusz", 90, "Goalkeeper");
    Player civic = new Player("Eldar Ćivić", 17, "Defender");
    Player blazic = new Player("Miha Blažič", 25, "Defender");
    Player botka = new Player("Endre Botka", 21, "Defender");
    Player wingo = new Player("Henry Wingo", 31, "Defender");
    Player laïdouni = new Player("Aïssa Laïdouni", 93, "Midfielder");
    Player esiti = new Player("Anderson Esiti", 13, "Midfielder");
    Player zubkov = new Player("Oleksandr Zubkov", 11, "Midfielder");
    Player uzuni = new Player("Myrto Uzuni", 77, "Forward");
    Player baturina = new Player("Roko Baturina", 9, "Forward");
    Player mak = new Player("Robert Mak", 20, "Forward");

    // FCSB
    Player tarnovanu = new Player("Ștefan Târnovanu", 32, "Goalkeeper");
    Player harut = new Player("Denis Haruț", 2, "Defender");
    Player cristea = new Player("Iulian Cristea", 17, "Defender");
    Player tamas = new Player("Gabriel Tamaș", 30, "Defender");
    Player pantiru = new Player("Ionuț Panțîru", 3, "Defender");
    Player edjouma = new Player("Malcom Edjouma", 6, "Midfielder");
    Player oaidă = new Player("Ovidiu Oaidă", 8, "Midfielder");
    Player popescu = new Player("Octavian Popescu", 10, "Midfielder");
    Player coman = new Player("Florinel Coman", 7, "Forward");
    Player tanase = new Player("Florin Tănase", 9, "Forward");
    Player dumiter = new Player("Andrei Dumiter", 11, "Forward");

    // Malmö FF
    Player dahlin = new Player("Johan Dahlin", 27, "Goalkeeper");
    Player moisander = new Player("Niklas Moisander", 4, "Defender");
    Player ahmedhodzic = new Player("Anel Ahmedhodžić", 15, "Defender");
    Player brorsson = new Player("Franz Brorsson", 17, "Defender");
    Player knudsen = new Player("Jonas Knudsen", 3, "Defender");
    Player rakip = new Player("Erdal Rakip", 7, "Midfielder");
    Player innocent = new Player("Bonke Innocent", 20, "Midfielder");
    Player christiansen = new Player("Anders Christiansen", 10, "Midfielder");
    Player birmančević = new Player("Veljko Birmančević", 19, "Forward");
    Player colak = new Player("Antonio Čolak", 9, "Forward");
    Player berget = new Player("Jo Inge Berget", 32, "Forward");

    // Maccabi Tel Aviv
    Player peretz = new Player("Daniel Peretz", 1, "Goalkeeper");
    Player sabag = new Player("Shahar Piven", 2, "Defender");
    Player hernandez = new Player("Enric Saborit", 4, "Defender");
    Player davidzada = new Player("Ofir Davidzada", 27, "Defender");
    Player biton = new Player("Dan Biton", 10, "Midfielder");
    Player glazer = new Player("Dan Glazer", 6, "Midfielder");
    Player golasa = new Player("Eyal Golasa", 23, "Midfielder");
    Player zahavi = new Player("Eran Zahavi", 7, "Forward");
    Player hoz = new Player("Yonatan Cohen", 11, "Forward");
    Player blackman = new Player("Nick Blackman", 9, "Forward");
    Player pesic = new Player("Aleksandar Pešić", 45, "Forward");
}
