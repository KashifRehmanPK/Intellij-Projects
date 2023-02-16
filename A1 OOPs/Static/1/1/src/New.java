class Use {
    int ID;
    int salary;
    static int CEO;

    public void show() {
        System.out.println(ID + " :: " + salary + " :: " + CEO);
    }


        public static void main(String[] args) {
            Use sajjad = new Use();
            sajjad.ID = 1;
            sajjad.salary = 5000;

            Use adeel = new Use();
            adeel.ID = 2;
            adeel.salary = 6000;

            sajjad.show();
            adeel.show();

        }
    }
