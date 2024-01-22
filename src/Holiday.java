class Holiday {
    private String date;
    private String name;

    public Holiday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dia " + date + " é " + name + "!";
    }
}

class App {
    public static void printHolidays(Holiday[] holidays) {
        for (Holiday holiday : holidays) {
            System.out.println(holiday.toString());
        }
    }

    public static String checkHoliday(String date, Holiday[] holidays) {
        for (Holiday holiday : holidays) {
            if (holiday.getDate().equals(date)) {
                return "Dia " + date + " é " + holiday.getName() + "!";
            }
        }
        return "Dia " + date + " não é feriado 🥲";
    }

    public static void main(String[] args) {
        Holiday[] holidays = {
            new Holiday("01-01-2024", "Confraternização Mundial"),
            new Holiday("12-02-2024", "Carnaval"),
            new Holiday("13-02-2024", "Carnaval"),
            new Holiday("29-03-2024", "Sexta-feira Santa"),
            new Holiday("21-04-2024", "Tiradentes"),
            new Holiday("01-05-2024", "Dia do Trabalho"),
            new Holiday("30-05-2024", "Corpus Christi"),
            new Holiday("07-09-2024", "Independência do Brasil"),
            new Holiday("12-10-2024", "Nossa Senhora Aparecida"),
            new Holiday("02-11-2024", "Finados"),
            new Holiday("15-11-2024", "Proclamação da República"),
            new Holiday("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"),
            new Holiday("25-12-2024", "Natal")
        };

        printHolidays(holidays);

        String dateToCheck = "29-03-2024";
        String message = checkHoliday(dateToCheck, holidays);
        System.out.println(message);
    }
}