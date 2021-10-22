class Main {
    static Hero hero = new Hero("Rohani", 21);

  public static void main(String[] args) {
    hero.player();

    hero.walk();
    hero.walk();

    hero.run();
    hero.run();
    hero.run();
    hero.run();

    hero.eat();
    hero.eat();
    hero.eat();
    hero.eat();
    hero.eat();
    
    hero.drink();
    hero.drink();

   // int a;
    //for (a = 1; a<= 50; a++){
      //  hero.walk();
    // }

    isRun(50);

    hero.jump();
    hero.jump();
    hero.jump();
    hero.jump();
    hero.jump();
    hero.jump();

    hero.sit();
    hero.sit();
    hero.sit();
    hero.sit();
    hero.sit();

    hero.attack();
    hero.attack();
    hero.attack();

  }


  static void isRun(int angka) {
    int a;
        for (a = 1; a<= angka; a++){
        hero.walk();
  }
}
}