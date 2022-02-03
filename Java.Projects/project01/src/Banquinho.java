public class Banquinho {
    static public void main(String[] args){
        int y = 1800;
        System.out.println("Saldo no banco R$" + y);
        int x = Integer.parseInt(args[1]);
        if(args[0].equals("add")){
            add(x, y);
        } else if(args[0].equals("pay")){
            pay(x, y);
        }
    }
    static void add(int x, int y){
        System.out.println("Adicionando dinheiro");
        System.out.println(y + x);
    }
    static void pay(int x,  int y){
        System.out.println("Retirando dinheiro");
        System.out.println(y - x);
    }
}
