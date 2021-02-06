class EnumJava {
  public enum Sex {
    MALE,
    FEMALE,
    OTHERS;

    public boolean isMale(Sex s) {
      return s == MALE;
    }

    public boolean isFemale(Sex s) {
      return s == FEMALE;
    }

    public boolean isOthers(Sex s) {
      return !(isMale(s) || isFemale(s));
    }
  }

  public enum People {
    WEIDA("weida", 1994, 10, 21, Sex.MALE),
    QINGYIN("qingyin", 1997, 5, 11, Sex.FEMALE);

    private final String name;
    private final int year;
    private final int month;
    private final int day;
    private final Sex s;

    People(String name, int year, int month, int day, Sex s) {
      this.name = name;
      this.year = year;
      this.month = month;
      this.day = day;
      this.s = s;
    }

    public void getBrithDay() {
      System.out.printf("%s's birthday is at %d-%d-%d, sex: %s\n", name, year, month, day, s.toString());
    }
  }

  public static void main(String args[]) {
    People a = People.WEIDA;
    People b = People.QINGYIN;
    a.getBrithDay();
    b.getBrithDay();
  }
}
