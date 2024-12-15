package Football_Project;

public class Match {
    private final Team homeTeam;
    private final Team awayTeam;
    private final int homeScored;
    private final int awayScored;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        double homeTeamsAdvantageFactor = 0.95;
        this.homeScored = 7 - (int)( homeTeamsAdvantageFactor * (Math.log(Math.random()*19+1) / Math.log(1.5)) );
        this.awayScored = 7 - (int)( Math.log(Math.random()*19+1) / Math.log(1.5) );
        /*Gerçek maçta takımların çok gol atma olasılığı gittikçe azalır o yüzden 0'dan 7'ye rastgele sayı seçme
        değil de 7'ye doğru daha da zor gol atma olasılığı lazım. Bu yüzden büyüme hızı olarak logaritma kullandım.
        2 tabanında 2 = 1, 2 tabanında 4 = 2, 2 tabanında 8 = 3. Görüldüğü gibi gittikçe zorlaşıyor gol sayısının
        yükselmesi. 1 ile 8 arasında rastgele bir sayı seçilir ise, 4-8 aralığında olma olasığı en büyük, dolayısıyla
        bu aralığın değersiz olması lazım ki az gol atılmış olsun, az gol atmak daha kolay olsun. Bundandır ki
        7 - [2 tabanında (randomNumber*8 + 1)] farkını alıcaz (1 ile toplamazsak logaritma 0 alabilir).
        En nadir 1 sayısı gelse 7 - 0'dan 7 gol atılır. Ben 1.5 tabanında aldım çünkü 128'lik cap aşırı zor oluyor.
        -Koray */
    } 

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public int getHomeScored() {
        return homeScored;
    }

    public int getAwayScored() {
        return awayScored;
    }
}
