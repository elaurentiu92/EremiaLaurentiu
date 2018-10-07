/*
 * Ecranul calculatorului
 */

package oopcomputer;

/**
 *
 * @author Laurentiu
 */
 class Ecran {

    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
       private String afisaj = "0";
       private Carcasa stapana;
       
       

        public String getAfisaj() {
            return afisaj;
        }

        public void setAfisaj(String afisaj) {
            
            switch (afisaj){
                case "+":
                operatiuneLocala('+');
                    break;
                case "-":
                    operatiuneLocala('-');
                    break;
                case "*":
                    operatiuneLocala('*');
                    break;
                case "/":
                   operatiuneLocala('/');
                    break;
                case "=":
                    stapana.getAlu().calculeaza();
                    break;
                default: 
                    
                
            }
            this.afisaj = afisaj;
        }
        /**
         * Private method for computation
         */
        private void operatiuneLocala(char c){
        stapana.getAlu().setOperandUnu(Integer.getInteger(afisaj));
        stapana.getAlu().setOperator(c);
        afisaj = Character.toString(c);
        }
}
