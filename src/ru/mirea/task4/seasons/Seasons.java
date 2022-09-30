package ru.mirea.task4.seasons;

public enum Seasons {
    SUMMER(18.4) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(5.9),
    WINTER(-6.1),
    SPRING(6.4);

    private double avgTemperature;

    Seasons(double avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public void printSeason(Seasons season) {
        switch (season) {
            case SUMMER : System.out.println("I love summer!"); break;
            case AUTUMN : System.out.println("I love autumn!"); break;
            case WINTER : System.out.println("I love winter!"); break;
            case SPRING : System.out.println("I love spring!"); break;
        }
    }

    public String getDescription() {
        return "Cold season";
    }

    static public void printAllSeasons() {
        for (Seasons season : Seasons.values()) {
            System.out.println("Season: "
                    + season
                    + "\tAverage temperature: "
                    + season.avgTemperature
                    + "\tDescription: "
                    + season.getDescription());
        }
    }
}
