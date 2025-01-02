package Football_Project;

public class DataInitializer {
    private final TeamManager teamManager;
    private final PlayerManager playerManager;
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

    public DataInitializer() {
        this.teamManager = new TeamManager();
        this.playerManager = new PlayerManager();

        initializeTeamsAndPlayers();
    }

    public void initializeTeamsAndPlayers() {

        teamManager.addTeam(galatasaray);
        teamManager.addTeam(fenerbahce);
        teamManager.addTeam(besiktas);
        teamManager.addTeam(tottenham);
        teamManager.addTeam(besiktas);
        teamManager.addTeam(tottenham);
        teamManager.addTeam(bilbao);
        teamManager.addTeam(frankfurt);
        teamManager.addTeam(roma);
        teamManager.addTeam(lyon);
        teamManager.addTeam(nice);
        teamManager.addTeam(prag);
        teamManager.addTeam(anderlecht);
        teamManager.addTeam(paok);
        teamManager.addTeam(Midtjylland);
        teamManager.addTeam(gilloise);
        teamManager.addTeam(twente);
        teamManager.addTeam(plzen);
        teamManager.addTeam(razgrad);
        teamManager.addTeam(glint);
        teamManager.addTeam(elfsborg);
        teamManager.addTeam(karabag);
        teamManager.addTeam(rfs);
        teamManager.addTeam(manu);
        teamManager.addTeam(sociedad);
        teamManager.addTeam(porto);
        teamManager.addTeam(lazio);
        teamManager.addTeam(ajax);
        teamManager.addTeam(hoffenheim);
        teamManager.addTeam(braga);
        teamManager.addTeam(olympiacos);
        teamManager.addTeam(kiev);
        teamManager.addTeam(rangers);
        teamManager.addTeam(alkmaar);
        teamManager.addTeam(ferencvaros);
        teamManager.addTeam(fcsb);
        teamManager.addTeam(malmo);


        // Galatasaray
        Player muslera = new Player("Fernando Muslera", 1, "Goalkeeper");
        Player ayhan = new Player("Kaan Ayhan", 2, "Defender");
        Player sanchez = new Player("Davinson Sánchez", 3, "Defender");
        Player nelsson = new Player("Victor Nelsson", 4, "Defender");
        Player yilmaz = new Player("Barış Alper Yılmaz", 5, "Defender");
        Player mertens = new Player("Dries Mertens", 6, "Midfielder");
        Player torreira = new Player("Lucas Torreira", 7, "Midfielder");
        Player sara = new Player("Gabriel Sara", 8, "Midfielder");
        Player akgun = new Player("Yunus Akgün", 9, "Midfielder");
        Player osimhen = new Player("Victor Osimhen", 10, "Forward");
        Player icardi = new Player("Mauro Icardi", 11, "Forward");

        galatasaray.addPlayer(muslera);
        galatasaray.addPlayer(ayhan);
        galatasaray.addPlayer(sanchez);
        galatasaray.addPlayer(nelsson);
        galatasaray.addPlayer(yilmaz);
        galatasaray.addPlayer(mertens);
        galatasaray.addPlayer(torreira);
        galatasaray.addPlayer(sara);
        galatasaray.addPlayer(akgun);
        galatasaray.addPlayer(osimhen);
        galatasaray.addPlayer(icardi);

// Fenerbahce
        Player livakovic = new Player("Dominik Livakovic", 12, "Goalkeeper");
        Player muldur = new Player("Mert Müldür", 13, "Defender");
        Player soyuncu = new Player("Çağlar Söyüncü", 14, "Defender");
        Player djiku = new Player("Alexander Djiku", 15, "Defender");
        Player oosterwolde = new Player("Jayden Oosterwolde", 16, "Defender");
        Player amrabat = new Player("Sofyan Amrabat", 17, "Midfielder");
        Player fred = new Player("Fred", 18, "Midfielder");
        Player szymanski = new Player("Sebastian Szymański", 19, "Midfielder");
        Player under = new Player("Cengiz Ünder", 20, "Forward");
        Player saint_maximin = new Player("Allan Saint-Maximin", 21, "Forward");
        Player dzeko = new Player("Edin Džeko", 22, "Forward");

        fenerbahce.addPlayer(livakovic);
        fenerbahce.addPlayer(muldur);
        fenerbahce.addPlayer(soyuncu);
        fenerbahce.addPlayer(djiku);
        fenerbahce.addPlayer(oosterwolde);
        fenerbahce.addPlayer(amrabat);
        fenerbahce.addPlayer(fred);
        fenerbahce.addPlayer(szymanski);
        fenerbahce.addPlayer(under);
        fenerbahce.addPlayer(saint_maximin);
        fenerbahce.addPlayer(dzeko);


// Besiktas
        Player gunok = new Player("Mert Günok", 23, "Goalkeeper");
        Player uduokhai = new Player("Felix Uduokhai", 24, "Defender");
        Player paulista = new Player("Gabriel Paulista", 25, "Defender");
        Player keles = new Player("Can Keleş", 26, "Defender");
        Player topcu = new Player("Emirhan Topçu", 27, "Defender");
        Player ndour = new Player("Cher Ndour", 28, "Midfielder");
        Player almusrati = new Player("Al-Musrati", 29, "Midfielder");
        Player silva = new Player("Rafa Silva", 30, "Midfielder");
        Player mario = new Player("João Mário", 31, "Midfielder");
        Player necip = new Player("Necip Uysal", 32, "Forward");
        Player akgunO = new Player("Oğuzhan Akgün", 33, "Forward");

        besiktas.addPlayer(gunok);
        besiktas.addPlayer(uduokhai);
        besiktas.addPlayer(paulista);
        besiktas.addPlayer(keles);
        besiktas.addPlayer(topcu);
        besiktas.addPlayer(ndour);
        besiktas.addPlayer(almusrati);
        besiktas.addPlayer(mario);
        besiktas.addPlayer(silva);
        besiktas.addPlayer(necip);
        besiktas.addPlayer(akgunO);


// Tottenham
        Player vicario = new Player("Guglielmo Vicario", 34, "Goalkeeper");
        Player porro = new Player("Pedro Porro", 35, "Defender");
        Player romero = new Player("Cristian Romero", 36, "Defender");
        Player vanDeVen = new Player("Micky van de Ven", 37, "Defender");
        Player udogie = new Player("Destiny Udogie", 38, "Defender");
        Player bissouma = new Player("Yves Bissouma", 39, "Midfielder");
        Player maddison = new Player("James Maddison", 40, "Midfielder");
        Player sarr = new Player("Pape Matar Sarr", 41, "Midfielder");
        Player kulusevski = new Player("Dejan Kulusevski", 42, "Forward");
        Player son = new Player("Son Heung-min", 43, "Forward");
        Player richarlison = new Player("Richarlison", 44, "Forward");

        tottenham.addPlayer(vicario);
        tottenham.addPlayer(porro);
        tottenham.addPlayer(romero);
        tottenham.addPlayer(vanDeVen);
        tottenham.addPlayer(udogie);
        tottenham.addPlayer(bissouma);
        tottenham.addPlayer(maddison);
        tottenham.addPlayer(sarr);
        tottenham.addPlayer(kulusevski);
        tottenham.addPlayer(son);
        tottenham.addPlayer(richarlison);


// Atletic Bilbao
        Player simon = new Player("Unai Simón", 45, "Goalkeeper");
        Player deMarcos = new Player("Óscar de Marcos", 46, "Defender");
        Player yeray = new Player("Yeray Álvarez", 47, "Defender");
        Player vivian = new Player("Dani Vivian", 48, "Defender");
        Player berchiche = new Player("Yuri Berchiche", 49, "Defender");
        Player vesga = new Player("Mikel Vesga", 50, "Midfielder");
        Player garcia = new Player("Raúl García", 51, "Midfielder");
        Player sancet = new Player("Oihan Sancet", 52, "Midfielder");
        Player williams = new Player("Iñaki Williams", 53, "Forward");
        Player nicoWilliams = new Player("Nico Williams", 54, "Forward");
        Player guruzeta = new Player("Gorka Guruzeta", 55, "Forward");

        bilbao.addPlayer(simon);
        bilbao.addPlayer(deMarcos);
        bilbao.addPlayer(yeray);
        bilbao.addPlayer(vivian);
        bilbao.addPlayer(berchiche);
        bilbao.addPlayer(vesga);
        bilbao.addPlayer(garcia);
        bilbao.addPlayer(sancet);
        bilbao.addPlayer(williams);
        bilbao.addPlayer(nicoWilliams);
        bilbao.addPlayer(guruzeta);


// Eintracht Frankfurt
        Player santos = new Player("Kauã Santos", 56, "Goalkeeper");
        Player kristensen = new Player("Rasmus Kristensen", 57, "Defender");
        Player koch = new Player("Robin Koch", 58, "Defender");
        Player theate = new Player("Arthur Theate", 59, "Defender");
        Player collins = new Player("Levi Colwill", 60, "Defender");
        Player skhiri = new Player("Ellyes Skhiri", 61, "Midfielder");
        Player hojilund = new Player("Oscar Højlund", 62, "Midfielder");
        Player chaibi = new Player("Fares Chaïbi", 63, "Midfielder");
        Player brown = new Player("Jacob Brown", 64, "Midfielder");
        Player marmoush = new Player("Omar Marmoush", 65, "Forward");
        Player ekitike = new Player("Hugo Ekitiké", 66, "Forward");

        frankfurt.addPlayer(santos);
        frankfurt.addPlayer(kristensen);
        frankfurt.addPlayer(koch);
        frankfurt.addPlayer(theate);
        frankfurt.addPlayer(collins);
        frankfurt.addPlayer(skhiri);
        frankfurt.addPlayer(hojilund);
        frankfurt.addPlayer(chaibi);
        frankfurt.addPlayer(brown);
        frankfurt.addPlayer(marmoush);
        frankfurt.addPlayer(ekitike);


// AS Roma
        Player patricio = new Player("Rui Patrício", 67, "Goalkeeper");
        Player mancini = new Player("Gianluca Mancini", 68, "Defender");
        Player llorente = new Player("Diego Llorente", 69, "Defender");
        Player ibanez = new Player("Roger Ibañez", 70, "Defender");
        Player spinazzola = new Player("Leonardo Spinazzola", 71, "Defender");
        Player cristante = new Player("Bryan Cristante", 72, "Midfielder");
        Player pellegrini = new Player("Lorenzo Pellegrini", 73, "Midfielder");
        Player aouar = new Player("Houssem Aouar", 74, "Midfielder");
        Player dybala = new Player("Paulo Dybala", 75, "Forward");
        Player belotti = new Player("Andrea Belotti", 76, "Forward");
        Player lukaku = new Player("Romelu Lukaku", 77, "Forward");

        roma.addPlayer(patricio);
        roma.addPlayer(mancini);
        roma.addPlayer(llorente);
        roma.addPlayer(ibanez);
        roma.addPlayer(spinazzola);
        roma.addPlayer(cristante);
        roma.addPlayer(pellegrini);
        roma.addPlayer(aouar);
        roma.addPlayer(dybala);
        roma.addPlayer(belotti);
        roma.addPlayer(lukaku);


// Lyon
        Player lopez = new Player("Anthony Lopes", 78, "Goalkeeper");
        Player kumbedi = new Player("Saël Kumbedi", 79, "Defender");
        Player lukeba = new Player("Castello Lukeba", 80, "Defender");
        Player lovren = new Player("Dejan Lovren", 81, "Defender");
        Player tagliafico = new Player("Nicolás Tagliafico", 82, "Defender");
        Player caqueret = new Player("Maxence Caqueret", 83, "Midfielder");
        Player toliso = new Player("Corentin Tolisso", 84, "Midfielder");
        Player lepenant = new Player("Johann Lepenant", 85, "Midfielder");
        Player cherki = new Player("Rayan Cherki", 86, "Forward");
        Player lacazette = new Player("Alexandre Lacazette", 87, "Forward");
        Player barcola = new Player("Bradley Barcola", 88, "Forward");

        lyon.addPlayer(lopez);
        lyon.addPlayer(kumbedi);
        lyon.addPlayer(lukeba);
        lyon.addPlayer(lovren);
        lyon.addPlayer(tagliafico);
        lyon.addPlayer(caqueret);
        lyon.addPlayer(toliso);
        lyon.addPlayer(lepenant);
        lyon.addPlayer(cherki);
        lyon.addPlayer(lacazette);
        lyon.addPlayer(barcola);


// OGC Nice
        Player bulka = new Player("Marcin Bułka", 89, "Goalkeeper");
        Player atal = new Player("Youcef Atal", 90, "Defender");
        Player dante = new Player("Dante", 91, "Defender");
        Player todibo = new Player("Jean-Clair Todibo", 92, "Defender");
        Player bard = new Player("Melvin Bard", 93, "Defender");
        Player thuram = new Player("Khéphren Thuram", 94, "Midfielder");
        Player boudaoui = new Player("Hicham Boudaoui", 95, "Midfielder");
        Player ramsey = new Player("Aaron Ramsey", 96, "Midfielder");
        Player laborde = new Player("Gaëtan Laborde", 97, "Forward");
        Player moffi = new Player("Terem Moffi", 98, "Forward");
        Player pepeN = new Player("Nicolas Pépé", 99, "Forward");

        nice.addPlayer(bulka);
        nice.addPlayer(atal);
        nice.addPlayer(dante);
        nice.addPlayer(todibo);
        nice.addPlayer(bard);
        nice.addPlayer(thuram);
        nice.addPlayer(boudaoui);
        nice.addPlayer(ramsey);
        nice.addPlayer(laborde);
        nice.addPlayer(moffi);
        nice.addPlayer(pepeN);



// SK Slavia Prag
        Player mandous = new Player("Aleš Mandous", 100, "Goalkeeper");
        Player bah = new Player("Alexander Bah", 101, "Defender");
        Player holes = new Player("Tomáš Holeš", 102, "Defender");
        Player ogbu = new Player("Igoh Ogbu", 103, "Defender");
        Player dorley = new Player("Oscar Dorley", 104, "Defender");
        Player sevcik = new Player("Petr Ševčík", 105, "Midfielder");
        Player traore = new Player("Ibrahim Traoré", 106, "Midfielder");
        Player lingr = new Player("Ondřej Lingr", 107, "Midfielder");
        Player masopust = new Player("Lukáš Masopust", 108, "Forward");
        Player tecl = new Player("Stanislav Tecl", 109, "Forward");
        Player schranz = new Player("Ivan Schranz", 110, "Forward");

        prag.addPlayer(mandous);
        prag.addPlayer(bah);
        prag.addPlayer(holes);
        prag.addPlayer(ogbu);
        prag.addPlayer(dorley);
        prag.addPlayer(sevcik);
        prag.addPlayer(traore);
        prag.addPlayer(lingr);
        prag.addPlayer(masopust);
        prag.addPlayer(tecl);
        prag.addPlayer(schranz);


// RSC Anderlecht
        Player verbruggen = new Player("Bart Verbruggen", 111, "Goalkeeper");
        Player murillo = new Player("Michael Murillo", 112, "Defender");
        Player debast = new Player("Zeno Debast", 113, "Defender");
        Player vertonghen = new Player("Jan Vertonghen", 114, "Defender");
        Player delcroix = new Player("Hannes Delcroix", 115, "Defender");
        Player arnstad = new Player("Kristian Arnstad", 116, "Midfielder");
        Player trebel = new Player("Adrien Trebel", 117, "Midfielder");
        Player ashimeru = new Player("Majeed Ashimeru", 118, "Midfielder");
        Player amuzu = new Player("Francis Amuzu", 119, "Forward");
        Player esposito = new Player("Sebastiano Esposito", 120, "Forward");
        Player stroeykens = new Player("Mario Stroeykens", 121, "Forward");

        anderlecht.addPlayer(verbruggen);
        anderlecht.addPlayer(murillo);
        anderlecht.addPlayer(debast);
        anderlecht.addPlayer(vertonghen);
        anderlecht.addPlayer(delcroix);
        anderlecht.addPlayer(arnstad);
        anderlecht.addPlayer(trebel);
        anderlecht.addPlayer(ashimeru);
        anderlecht.addPlayer(amuzu);
        anderlecht.addPlayer(esposito);
        anderlecht.addPlayer(stroeykens);


// PAOK
        Player kotarski = new Player("Dominik Kotarski", 122, "Goalkeeper");
        Player vieirinha = new Player("Vieirinha", 123, "Defender");
        Player ingason = new Player("Sverrir Ingi Ingason", 124, "Defender");
        Player crespo = new Player("José Ángel Crespo", 125, "Defender");
        Player rafaSoares = new Player("Rafa Soares", 126, "Defender");
        Player schwab = new Player("Stefan Schwab", 127, "Midfielder");
        Player kurtic = new Player("Jasmin Kurtić", 128, "Midfielder");
        Player misic = new Player("Josip Mišić", 129, "Midfielder");
        Player zivkovic = new Player("Andrija Živković", 130, "Forward");
        Player olivera = new Player("Nelson Oliveira", 131, "Forward");
        Player akpom = new Player("Chuba Akpom", 132, "Forward");

        paok.addPlayer(kotarski);
        paok.addPlayer(vieirinha);
        paok.addPlayer(ingason);
        prag.addPlayer(crespo);
        prag.addPlayer(rafaSoares);
        prag.addPlayer(schwab);
        prag.addPlayer(kurtic);
        prag.addPlayer(misic);
        prag.addPlayer(zivkovic);
        prag.addPlayer(olivera);
        prag.addPlayer(akpom);

// FC Midtjylland
        Player loessl = new Player("Jonas Lössl", 133, "Goalkeeper");
        Player andersson = new Player("Henrik Dalsgaard", 134, "Defender");
        Player sviatchenko = new Player("Erik Sviatchenko", 135, "Defender");
        Player juninho = new Player("Juninho", 136, "Defender");
        Player paulinho = new Player("Paulinho", 137, "Defender");
        Player evander = new Player("Evander", 138, "Midfielder");
        Player onyedika = new Player("Raphael Onyedika", 139, "Midfielder");
        Player dreyer = new Player("Anders Dreyer", 140, "Midfielder");
        Player isaksen = new Player("Gustav Isaksen", 141, "Forward");
        Player brumado = new Player("Júnior Brumado", 142, "Forward");
        Player kraev = new Player("Bozhidar Kraev", 143, "Forward");

        Midtjylland.addPlayer(loessl);
        Midtjylland.addPlayer(andersson);
        Midtjylland.addPlayer(sviatchenko);
        Midtjylland.addPlayer(juninho);
        Midtjylland.addPlayer(paulinho);
        Midtjylland.addPlayer(evander);
        Midtjylland.addPlayer(onyedika);
        Midtjylland.addPlayer(dreyer);
        Midtjylland.addPlayer(isaksen);
        Midtjylland.addPlayer(brumado);
        Midtjylland.addPlayer(kraev);


// Union Saint-Gilloise
        Player moris = new Player("Anthony Moris", 144, "Goalkeeper");
        Player nieuwkoop = new Player("Bart Nieuwkoop", 145, "Defender");
        Player van_der_heyden = new Player("Christian Burgess", 146, "Defender");
        Player bager = new Player("Ismaël Kandouss", 147, "Defender");
        Player lapoussin = new Player("Loïc Lapoussin", 148, "Defender");
        Player lynen = new Player("Senne Lynen", 149, "Midfielder");
        Player teuma = new Player("Teddy Teuma", 150, "Midfielder");
        Player lazare = new Player("Jean Thierry Lazare", 151, "Midfielder");
        Player boniface = new Player("Victor Boniface", 152, "Forward");
        Player vanzeir = new Player("Dante Vanzeir", 153, "Forward");
        Player adingra = new Player("Simon Adingra", 154, "Forward");

        gilloise.addPlayer(moris);
        gilloise.addPlayer(nieuwkoop);
        gilloise.addPlayer(van_der_heyden);
        gilloise.addPlayer(bager);
        gilloise.addPlayer(lapoussin);
        gilloise.addPlayer(lynen);
        gilloise.addPlayer(teuma);
        gilloise.addPlayer(lazare);
        gilloise.addPlayer(boniface);
        gilloise.addPlayer(vanzeir);
        gilloise.addPlayer(adingra);


// FC Twente Enschede
        Player unnerstall = new Player("Lars Unnerstall", 155, "Goalkeeper");
        Player bruns = new Player("Mees Hilgers", 156, "Defender");
        Player pierie = new Player("Kik Pierie", 157, "Defender");
        Player propper = new Player("Robin Pröpper", 158, "Defender");
        Player smal = new Player("Gijs Smal", 159, "Defender");
        Player zerrouki = new Player("Ramiz Zerrouki", 160, "Midfielder");
        Player sadilek = new Player("Michal Sadílek", 161, "Midfielder");
        Player vlap = new Player("Michel Vlap", 162, "Midfielder");
        Player cerny = new Player("Vaclav Cerny", 163, "Forward");
        Player ricky = new Player("Ricky van Wolfswinkel", 164, "Forward");
        Player misidjan = new Player("Virgil Misidjan", 165, "Forward");

        twente.addPlayer(unnerstall);
        twente.addPlayer(bruns);
        twente.addPlayer(pierie);
        twente.addPlayer(propper);
        twente.addPlayer(smal);
        twente.addPlayer(zerrouki);
        twente.addPlayer(sadilek);
        twente.addPlayer(vlap);
        twente.addPlayer(cerny);
        twente.addPlayer(ricky);
        twente.addPlayer(misidjan);

// FC Viktoria Plzen
        Player stanek = new Player("Jindřich Staněk", 166, "Goalkeeper");
        Player hejda = new Player("Lukáš Hejda", 167, "Defender");
        Player pernica = new Player("Jakub Brabec", 168, "Defender");
        Player havel = new Player("Milan Havel", 169, "Defender");
        Player mosquera = new Player("Radim Řezník", 170, "Defender");
        Player kalvach = new Player("Lukáš Kalvach", 171, "Midfielder");
        Player buchta = new Player("Pavel Bucha", 172, "Midfielder");
        Player cermak = new Player("Aleš Čermák", 173, "Midfielder");
        Player chory = new Player("Tomáš Chorý", 174, "Forward");
        Player mosqueraJ = new Player("Jhon Mosquera", 175, "Forward");
        Player baLoua = new Player("Adriel Ba Loua", 176, "Forward");

        plzen.addPlayer(stanek);
        plzen.addPlayer(hejda);
        plzen.addPlayer(pernica);
        plzen.addPlayer(havel);
        plzen.addPlayer(mosquera);
        plzen.addPlayer(kalvach);
        plzen.addPlayer(buchta);
        plzen.addPlayer(cermak);
        plzen.addPlayer(chory);
        plzen.addPlayer(mosqueraJ);
        plzen.addPlayer(baLoua);


// Ludogorets Razgrad
        Player puscas = new Player("Giedrius Arlauskis", 177, "Goalkeeper");
        Player cicinho = new Player("Cicinho", 178, "Defender");
        Player verdon = new Player("Olivier Verdon", 179, "Defender");
        Player terziev = new Player("Georgi Terziev", 180, "Defender");
        Player nedyalkov = new Player("Anton Nedyalkov", 181, "Defender");
        Player dyakov = new Player("Svetoslav Dyakov", 182, "Midfielder");
        Player badji = new Player("Stéphane Badji", 183, "Midfielder");
        Player santana = new Player("Alex Santana", 184, "Midfielder");
        Player despodov = new Player("Kiril Despodov", 185, "Forward");
        Player sotiriou = new Player("Pieros Sotiriou", 186, "Forward");
        Player tekpetey = new Player("Bernard Tekpetey", 187, "Forward");

        razgrad.addPlayer(puscas);
        razgrad.addPlayer(cicinho);
        razgrad.addPlayer(verdon);
        razgrad.addPlayer(terziev);
        razgrad.addPlayer(nedyalkov);
        razgrad.addPlayer(dyakov);
        razgrad.addPlayer(badji);
        razgrad.addPlayer(santana);
        razgrad.addPlayer(despodov);
        razgrad.addPlayer(sotiriou);
        razgrad.addPlayer(tekpetey);

// Glint
        Player horvath = new Player("Ethan Horvath", 188, "Goalkeeper");
        Player arteaga = new Player("Gerardo Arteaga", 189, "Defender");
        Player cuestas = new Player("Carlos Cuesta", 190, "Defender");
        Player mckenzie = new Player("Mark McKenzie", 191, "Defender");
        Player munoz = new Player("Daniel Muñoz", 192, "Defender");
        Player heyden = new Player("Bryan Heynen", 193, "Midfielder");
        Player thorstvedt = new Player("Kristian Thorstvedt", 194, "Midfielder");
        Player tresor = new Player("Mike Trésor", 195, "Midfielder");
        Player onuachu = new Player("Paul Onuachu", 196, "Forward");
        Player paintsil = new Player("Joseph Paintsil", 197, "Forward");
        Player bongonda = new Player("Théo Bongonda", 198, "Forward");

        glint.addPlayer(horvath);
        glint.addPlayer(arteaga);
        glint.addPlayer(cuestas);
        glint.addPlayer(mckenzie);
        glint.addPlayer(munoz);
        glint.addPlayer(heyden);
        glint.addPlayer(thorstvedt);
        glint.addPlayer(tresor);
        glint.addPlayer(onuachu);
        glint.addPlayer(paintsil);
        glint.addPlayer(bongonda);


// IF Elfsborg
        Player ronn = new Player("Tim Rönning", 199, "Goalkeeper");
        Player larsson = new Player("Johan Larsson", 200, "Defender");
        Player holst = new Player("Frederik Holst", 201, "Defender");
        Player okumu = new Player("Joseph Okumu", 202, "Defender");
        Player strand = new Player("Simon Strand", 203, "Defender");
        Player olsson = new Player("Robert Gojani", 204, "Midfielder");
        Player frick = new Player("Per Frick", 205, "Midfielder");
        Player holmen = new Player("Samuel Holmén", 206, "Midfielder");
        Player ondrejka = new Player("Jacob Ondrejka", 207, "Forward");
        Player alm = new Player("Rasmus Alm", 208, "Forward");
        Player bernhardsson = new Player("Jeppe Okkels", 209, "Forward");


        elfsborg.addPlayer(ronn);
        elfsborg.addPlayer(larsson);
        elfsborg.addPlayer(holst);
        elfsborg.addPlayer(okumu);
        elfsborg.addPlayer(strand);
        elfsborg.addPlayer(olsson);
        elfsborg.addPlayer(frick);
        elfsborg.addPlayer(holmen);
        elfsborg.addPlayer(ondrejka);
        elfsborg.addPlayer(alm);
        elfsborg.addPlayer(bernhardsson);

// Qarabağ FK
        Player begovic = new Player("Asmir Begović", 210, "Goalkeeper");
        Player medvedev = new Player("Maksim Medvedev", 211, "Defender");
        Player huseynov = new Player("Rashad Sadygov", 212, "Defender");
        Player garayev = new Player("Qara Qarayev", 213, "Defender");
        Player agolli = new Player("Ansi Agolli", 214, "Defender");
        Player richard = new Player("Richard Almeida", 215, "Midfielder");
        Player michel = new Player("Michel", 216, "Midfielder");
        Player quintana = new Player("Dani Quintana", 217, "Midfielder");
        Player zoubir = new Player("Abdellah Zoubir", 218, "Forward");
        Player emreli = new Player("Mahir Emreli", 219, "Forward");
        Player romeroJ = new Player("Jaime Romero", 220, "Forward");

        karabag.addPlayer(begovic);
        karabag.addPlayer(medvedev);
        karabag.addPlayer(huseynov);
        karabag.addPlayer(garayev);
        karabag.addPlayer(agolli);
        karabag.addPlayer(richard);
        karabag.addPlayer(michel);
        karabag.addPlayer(quintana);
        karabag.addPlayer(zoubir);
        karabag.addPlayer(emreli);
        karabag.addPlayer(romeroJ);

// FC RFS
        Player steinbors = new Player("Pāvels Šteinbors", 221, "Goalkeeper");
        Player jagodinskis = new Player("Vitālijs Jagodinskis", 222, "Defender");
        Player savalnieks = new Player("Roberts Savaļnieks", 223, "Defender");
        Player stuglis = new Player("Kārlis Štāls", 224, "Defender");
        Player solovjovs = new Player("Aleksandrs Solovjovs", 225, "Defender");
        Player simkovic = new Player("Tomáš Šimkovič", 226, "Midfielder");
        Player lipuscek = new Player("Žan Lipušček", 227, "Midfielder");
        Player klesniks = new Player("Artūrs Zjuzins", 228, "Midfielder");
        Player iliev = new Player("Dāvis Ikaunieks", 229, "Forward");
        Player rakels = new Player("Deniss Rakels", 230, "Forward");
        Player bilinski = new Player("Maksims Uvarenko", 231, "Forward");

        rfs.addPlayer(steinbors);
        rfs.addPlayer(jagodinskis);
        rfs.addPlayer(savalnieks);
        rfs.addPlayer(stuglis);
        rfs.addPlayer(solovjovs);
        rfs.addPlayer(simkovic);
        rfs.addPlayer(lipuscek);
        rfs.addPlayer(klesniks);
        rfs.addPlayer(iliev);
        rfs.addPlayer(rakels);
        rfs.addPlayer(bilinski);


// Manchester United
        Player onana = new Player("André Onana", 232, "Goalkeeper");
        Player dalot = new Player("Diogo Dalot", 233, "Defender");
        Player varane = new Player("Raphaël Varane", 234, "Defender");
        Player martinez = new Player("Lisandro Martínez", 235, "Defender");
        Player shaw = new Player("Luke Shaw", 236, "Defender");
        Player casemiro = new Player("Casemiro", 237, "Midfielder");
        Player fernandes = new Player("Bruno Fernandes", 238, "Midfielder");
        Player eriksen = new Player("Christian Eriksen", 239, "Midfielder");
        Player rashford = new Player("Marcus Rashford", 240, "Forward");
        Player martial = new Player("Anthony Martial", 241, "Forward");
        Player sancho = new Player("Jadon Sancho", 242, "Forward");

        manu.addPlayer(onana);
        manu.addPlayer(dalot);
        manu.addPlayer(varane);
        manu.addPlayer(martinez);
        manu.addPlayer(shaw);
        manu.addPlayer(casemiro);
        manu.addPlayer(fernandes);
        manu.addPlayer(eriksen);
        manu.addPlayer(rashford);
        manu.addPlayer(martial);
        manu.addPlayer(sancho);

// Real Sociedad
        Player remiro = new Player("Álex Remiro", 243, "Goalkeeper");
        Player gorosabel = new Player("Andoni Gorosabel", 244, "Defender");
        Player le_normand = new Player("Robin Le Normand", 245, "Defender");
        Player zubeldia = new Player("Igor Zubeldia", 246, "Defender");
        Player rico = new Player("Diego Rico", 247, "Defender");
        Player merino = new Player("Mikel Merino", 248, "Midfielder");
        Player zubimendi = new Player("Martín Zubimendi", 249, "Midfielder");
        Player silvaD = new Player("David Silva", 250, "Midfielder");
        Player oyarzabal = new Player("Mikel Oyarzabal", 251, "Forward");
        Player sorloth = new Player("Alexander Sørloth", 252, "Forward");
        Player isak = new Player("Alexander Isak", 253, "Forward");

        sociedad.addPlayer(remiro);
        sociedad.addPlayer(gorosabel);
        sociedad.addPlayer(le_normand);
        sociedad.addPlayer(zubeldia);
        sociedad.addPlayer(rico);
        sociedad.addPlayer(merino);
        sociedad.addPlayer(zubimendi);
        sociedad.addPlayer(silvaD);
        sociedad.addPlayer(oyarzabal);
        sociedad.addPlayer(sorloth);
        sociedad.addPlayer(isak);

// FC Porto
        Player costa = new Player("Diogo Costa", 254, "Goalkeeper");
        Player marioJ = new Player("João Mário", 255, "Defender");
        Player pepe = new Player("Pepe", 256, "Defender");
        Player cardoso = new Player("David Carmo", 257, "Defender");
        Player wendell = new Player("Wendell", 258, "Defender");
        Player uribe = new Player("Mateus Uribe", 259, "Midfielder");
        Player otavio = new Player("Otávio", 260, "Midfielder");
        Player eustaquio = new Player("Stephen Eustáquio", 261, "Midfielder");
        Player taremi = new Player("Mehdi Taremi", 262, "Forward");
        Player evanilson = new Player("Evanilson", 263, "Forward");
        Player galeno = new Player("Galeno", 264, "Forward");

        porto.addPlayer(costa);
        porto.addPlayer(marioJ);
        porto.addPlayer(pepe);
        porto.addPlayer(cardoso);
        porto.addPlayer(wendell);
        porto.addPlayer(uribe);
        porto.addPlayer(eustaquio);
        porto.addPlayer(otavio);
        porto.addPlayer(galeno);
        porto.addPlayer(taremi);
        porto.addPlayer(evanilson);

// SS Lazio
        Player provedel = new Player("Ivan Provedel", 265, "Goalkeeper");
        Player marusic = new Player("Adam Marušić", 266, "Defender");
        Player romagnoli = new Player("Alessio Romagnoli", 267, "Defender");
        Player casale = new Player("Nicolò Casale", 268, "Defender");
        Player hysaj = new Player("Elseid Hysaj", 269, "Defender");
        Player cataldi = new Player("Danilo Cataldi", 270, "Midfielder");
        Player alberto = new Player("Luis Alberto", 271, "Midfielder");
        Player anderson = new Player("Felipe Anderson", 272, "Midfielder");
        Player immobileC = new Player("Ciro Immobile", 273, "Forward");
        Player zaccagni = new Player("Mattia Zaccagni", 274, "Forward");
        Player pedro = new Player("Pedro", 275, "Forward");

        lazio.addPlayer(provedel);
        lazio.addPlayer(marusic);
        lazio.addPlayer(romagnoli);
        lazio.addPlayer(casale);
        lazio.addPlayer(hysaj);
        lazio.addPlayer(alberto);
        lazio.addPlayer(immobileC);
        lazio.addPlayer(zaccagni);
        lazio.addPlayer(pedro);
        lazio.addPlayer(anderson);
        lazio.addPlayer(cataldi);

// Ajax Amsterdam
        Player gorter = new Player("Jay Gorter", 276, "Goalkeeper");
        Player sanchezJ = new Player("Jorge Sánchez", 277, "Defender");
        Player timber = new Player("Jurriën Timber", 278, "Defender");
        Player bassi = new Player("Calvin Bassey", 279, "Defender");
        Player wijndal = new Player("Owen Wijndal", 280, "Defender");
        Player taylor = new Player("Kenneth Taylor", 281, "Midfielder");
        Player alvarez = new Player("Edson Álvarez", 282, "Midfielder");
        Player berghuis = new Player("Steven Berghuis", 283, "Midfielder");
        Player tadic = new Player("Dušan Tadić", 284, "Forward");
        Player brobbey = new Player("Brian Brobbey", 285, "Forward");
        Player bergwijn = new Player("Steven Bergwijn", 286, "Forward");

        ajax.addPlayer(gorter);
        ajax.addPlayer(sanchezJ);
        ajax.addPlayer(timber);
        ajax.addPlayer(bassi);
        ajax.addPlayer(wijndal);
        ajax.addPlayer(taylor);
        ajax.addPlayer(alvarez);
        ajax.addPlayer(berghuis);
        ajax.addPlayer(tadic);
        ajax.addPlayer(brobbey);
        ajax.addPlayer(bergwijn);

// TSG 1899 Hoffenheim
        Player baumann = new Player("Oliver Baumann", 287, "Goalkeeper");
        Player kabak = new Player("Ozan Kabak", 288, "Defender");
        Player vogt = new Player("Kevin Vogt", 289, "Defender");
        Player akpoguma = new Player("Kevin Akpoguma", 290, "Defender");
        Player angelino = new Player("Angeliño", 291, "Defender");
        Player geiger = new Player("Dennis Geiger", 292, "Midfielder");
        Player promel = new Player("Grischa Prömel", 293, "Midfielder");
        Player kramaric = new Player("Andrej Kramarić", 294, "Midfielder");
        Player bebu = new Player("Ihlas Bebou", 295, "Forward");
        Player dabbur = new Player("Munas Dabbur", 296, "Forward");
        Player rutter = new Player("Georginio Rutter", 297, "Forward");

        hoffenheim.addPlayer(baumann);
        hoffenheim.addPlayer(kabak);
        hoffenheim.addPlayer(vogt);
        hoffenheim.addPlayer(akpoguma);
        hoffenheim.addPlayer(angelino);
        hoffenheim.addPlayer(geiger);
        hoffenheim.addPlayer(promel);
        hoffenheim.addPlayer(kramaric);
        hoffenheim.addPlayer(bebu);
        hoffenheim.addPlayer(dabbur);
        hoffenheim.addPlayer(rutter);


// SC Braga
        Player matheus = new Player("Matheus", 298, "Goalkeeper");
        Player fabiano = new Player("Fabiano", 299, "Defender");
        Player tormena = new Player("Vítor Tormena", 300, "Defender");
        Player niakate = new Player("Sikou Niakaté", 301, "Defender");
        Player sequeira = new Player("Nuno Sequeira", 302, "Defender");
        Player al_musrati = new Player("Al Musrati", 303, "Midfielder");
        Player castro = new Player("André Castro", 304, "Midfielder");
        Player horta = new Player("Ricardo Horta", 305, "Midfielder");
        Player ruiz = new Player("Abel Ruiz", 306, "Forward");
        Player banzar = new Player("Simon Banza", 307, "Forward");
        Player medeiros = new Player("Iuri Medeiros", 308, "Forward");

        braga.addPlayer(matheus);
        braga.addPlayer(fabiano);
        braga.addPlayer(tormena);
        braga.addPlayer(niakate);
        braga.addPlayer(sequeira);
        braga.addPlayer(al_musrati);
        braga.addPlayer(castro);
        braga.addPlayer(horta);
        braga.addPlayer(ruiz);
        braga.addPlayer(banzar);
        braga.addPlayer(medeiros);

// Olympiacos
        Player paschalakis = new Player("Alexandros Paschalakis", 309, "Goalkeeper");
        Player rodinei = new Player("Rodinei", 310, "Defender");
        Player ba = new Player("Ousseynou Ba", 311, "Defender");
        Player reabciuk = new Player("Oleg Reabciuk", 312, "Defender");
        Player papastathopoulos = new Player("Sokratis Papastathopoulos", 313, "Defender");
        Player camara = new Player("Mady Camara", 314, "Midfielder");
        Player biel = new Player("Pep Biel", 315, "Midfielder");
        Player fortounis = new Player("Kostas Fortounis", 316, "Midfielder");
        Player el_arabi = new Player("Youssef El-Arabi", 317, "Forward");
        Player masouras = new Player("Giorgos Masouras", 318, "Forward");
        Player bakambu = new Player("Cédric Bakambu", 319, "Forward");

        olympiacos.addPlayer(paschalakis);
        olympiacos.addPlayer(rodinei);
        olympiacos.addPlayer(ba);
        olympiacos.addPlayer(reabciuk);
        olympiacos.addPlayer(papastathopoulos);
        olympiacos.addPlayer(camara);
        olympiacos.addPlayer(biel);
        olympiacos.addPlayer(fortounis);
        olympiacos.addPlayer(el_arabi);
        olympiacos.addPlayer(masouras);
        olympiacos.addPlayer(bakambu);

// Dynamo Kiev
        Player bushchan = new Player("Georgiy Bushchan", 320, "Goalkeeper");
        Player tymchyk = new Player("Oleksandr Tymchyk", 321, "Defender");
        Player zabarnyi = new Player("Illia Zabarnyi", 322, "Defender");
        Player syrota = new Player("Oleksandr Syrota", 323, "Defender");
        Player karavaev = new Player("Oleksandr Karavaev", 324, "Defender");
        Player sydorchuk = new Player("Serhiy Sydorchuk", 325, "Midfielder");
        Player shaparenko = new Player("Mykola Shaparenko", 326, "Midfielder");
        Player buyalskyi = new Player("Vitaliy Buyalskyi", 327, "Midfielder");
        Player tsigankov = new Player("Viktor Tsygankov", 328, "Forward");
        Player besedin = new Player("Artem Besedin", 329, "Forward");
        Player verbic = new Player("Benjamin Verbic", 330, "Forward");

        kiev.addPlayer(bushchan);
        kiev.addPlayer(tymchyk);
        kiev.addPlayer(zabarnyi);
        kiev.addPlayer(syrota);
        kiev.addPlayer(karavaev);
        kiev.addPlayer(shaparenko);
        kiev.addPlayer(tsigankov);
        kiev.addPlayer(buyalskyi);
        kiev.addPlayer(besedin);
        kiev.addPlayer(verbic);
        kiev.addPlayer(sydorchuk);

// Glasgow Rangers
        Player mclaughlin = new Player("Jon McLaughlin", 331, "Goalkeeper");
        Player tavernier = new Player("James Tavernier", 332, "Defender");
        Player goldson = new Player("Connor Goldson", 333, "Defender");
        Player helander = new Player("Filip Helander", 334, "Defender");
        Player barisic = new Player("Borna Barišić", 335, "Defender");
        Player davis = new Player("Steven Davis", 336, "Midfielder");
        Player kamara = new Player("Glen Kamara", 337, "Midfielder");
        Player arfield = new Player("Scott Arfield", 338, "Midfielder");
        Player kent = new Player("Ryan Kent", 339, "Forward");
        Player morelos = new Player("Alfredo Morelos", 340, "Forward");
        Player roofe = new Player("Kemar Roofe", 341, "Forward");

        rangers.addPlayer(mclaughlin);
        rangers.addPlayer(tavernier);
        rangers.addPlayer(goldson);
        rangers.addPlayer(helander);
        rangers.addPlayer(barisic);
        rangers.addPlayer(davis);
        rangers.addPlayer(kamara);
        rangers.addPlayer(arfield);
        rangers.addPlayer(kent);
        rangers.addPlayer(morelos);
        rangers.addPlayer(roofe);

// AZ Alkmaar
        Player ryan = new Player("Mathew Ryan", 342, "Goalkeeper");
        Player sugawara = new Player("Yukinari Sugawara", 343, "Defender");
        Player beukema = new Player("Sam Beukema", 344, "Defender");
        Player hadzi = new Player("Zinho Vanheusden", 345, "Defender");
        Player kerkez = new Player("Milos Kerkez", 346, "Defender");
        Player deWit = new Player("Dani de Wit", 347, "Midfielder");
        Player reijnders = new Player("Tijjani Reijnders", 348, "Midfielder");
        Player clasie = new Player("Jordy Clasie", 349, "Midfielder");
        Player pavlidis = new Player("Vangelis Pavlidis", 350, "Forward");
        Player odgaard = new Player("Jens Odgaard", 351, "Forward");
        Player karlsson = new Player("Jesper Karlsson", 352, "Forward");

        alkmaar.addPlayer(ryan);
        alkmaar.addPlayer(sugawara);
        alkmaar.addPlayer(beukema);
        alkmaar.addPlayer(hadzi);
        alkmaar.addPlayer(kerkez);
        alkmaar.addPlayer(deWit);
        alkmaar.addPlayer(reijnders);
        alkmaar.addPlayer(clasie);
        alkmaar.addPlayer(pavlidis);
        alkmaar.addPlayer(odgaard);
        alkmaar.addPlayer(karlsson);

// Ferencvaros
        Player dibusz = new Player("Dénes Dibusz", 353, "Goalkeeper");
        Player civic = new Player("Eldar Ćivić", 354, "Defender");
        Player blazic = new Player("Miha Blažič", 355, "Defender");
        Player botka = new Player("Endre Botka", 356, "Defender");
        Player wingo = new Player("Henry Wingo", 357, "Defender");
        Player laidouni = new Player("Aïssa Laïdouni", 358, "Midfielder");
        Player esiti = new Player("Anderson Esiti", 359, "Midfielder");
        Player zubkov = new Player("Oleksandr Zubkov", 360, "Midfielder");
        Player uzuni = new Player("Myrto Uzuni", 361, "Forward");
        Player baturina = new Player("Roko Baturina", 362, "Forward");
        Player mak = new Player("Robert Mak", 363, "Forward");

        ferencvaros.addPlayer(dibusz);
        ferencvaros.addPlayer(civic);
        ferencvaros.addPlayer(blazic);
        ferencvaros.addPlayer(botka);
        ferencvaros.addPlayer(wingo);
        ferencvaros.addPlayer(laidouni);
        ferencvaros.addPlayer(esiti);
        ferencvaros.addPlayer(zubkov);
        ferencvaros.addPlayer(uzuni);
        ferencvaros.addPlayer(baturina);
        ferencvaros.addPlayer(mak);

// FCSB
        Player tarnovanu = new Player("Ștefan Târnovanu", 364, "Goalkeeper");
        Player harut = new Player("Denis Haruț", 365, "Defender");
        Player cristea = new Player("Iulian Cristea", 366, "Defender");
        Player tamas = new Player("Gabriel Tamaș", 367, "Defender");
        Player pantiru = new Player("Ionuț Panțîru", 368, "Defender");
        Player edjouma = new Player("Malcom Edjouma", 369, "Midfielder");
        Player oaida = new Player("Ovidiu Oaidă", 370, "Midfielder");
        Player popescu = new Player("Octavian Popescu", 371, "Midfielder");
        Player coman = new Player("Florinel Coman", 372, "Forward");
        Player tanase = new Player("Florin Tănase", 373, "Forward");
        Player dumiter = new Player("Andrei Dumiter", 374, "Forward");

        fcsb.addPlayer(tarnovanu);
        fcsb.addPlayer(harut);
        fcsb.addPlayer(cristea);
        fcsb.addPlayer(tamas);
        fcsb.addPlayer(pantiru);
        fcsb.addPlayer(edjouma);
        fcsb.addPlayer(oaida);
        fcsb.addPlayer(popescu);
        fcsb.addPlayer(coman);
        fcsb.addPlayer(tanase);
        fcsb.addPlayer(dumiter);

// Malmö FF
        Player dahlin = new Player("Johan Dahlin", 375, "Goalkeeper");
        Player moisander = new Player("Niklas Moisander", 376, "Defender");
        Player ahmedhodzic = new Player("Anel Ahmedhodžić", 377, "Defender");
        Player brorsson = new Player("Franz Brorsson", 378, "Defender");
        Player knudsen = new Player("Jonas Knudsen", 379, "Defender");
        Player rakip = new Player("Erdal Rakip", 380, "Midfielder");
        Player innocent = new Player("Bonke Innocent", 381, "Midfielder");
        Player christiansen = new Player("Anders Christiansen", 382, "Midfielder");
        Player birmancevic = new Player("Veljko Birmančević", 383, "Forward");
        Player colak = new Player("Antonio Čolak", 384, "Forward");
        Player berget = new Player("Jo Inge Berget", 385, "Forward");

        malmo.addPlayer(dahlin);
        malmo.addPlayer(moisander);
        malmo.addPlayer(ahmedhodzic);
        malmo.addPlayer(brorsson);
        malmo.addPlayer(knudsen);
        malmo.addPlayer(rakip);
        malmo.addPlayer(innocent);
        malmo.addPlayer(christiansen);
        malmo.addPlayer(birmancevic);
        malmo.addPlayer(colak);
        malmo.addPlayer(berget);

// Maccabi Tel Aviv
        Player peretz = new Player("Daniel Peretz", 386, "Goalkeeper");
        Player sabag = new Player("Shahar Piven", 387, "Defender");
        Player hernandez = new Player("Enric Saborit", 388, "Defender");
        Player davidzada = new Player("Ofir Davidzada", 389, "Defender");
        Player biton = new Player("Dan Biton", 390, "Midfielder");
        Player glazer = new Player("Dan Glazer", 391, "Midfielder");
        Player golasa = new Player("Eyal Golasa", 392, "Midfielder");
        Player zahavi = new Player("Eran Zahavi", 393, "Forward");
        Player hoz = new Player("Yonatan Cohen", 394, "Forward");
        Player blackman = new Player("Nick Blackman", 395, "Forward");
        Player pesic = new Player("Aleksandar Pešić", 396, "Forward");

        telaviv.addPlayer(peretz);
        telaviv.addPlayer(sabag);
        telaviv.addPlayer(hernandez);
        telaviv.addPlayer(davidzada);
        telaviv.addPlayer(biton);
        telaviv.addPlayer(glazer);
        telaviv.addPlayer(golasa);
        telaviv.addPlayer(zahavi);
        telaviv.addPlayer(hoz);
        telaviv.addPlayer(blackman);
        telaviv.addPlayer(pesic);
    }
}

