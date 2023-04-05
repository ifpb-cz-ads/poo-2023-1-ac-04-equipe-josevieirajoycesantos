public class CTExercicio01{
    public static void main(String[] args){
        int idade= 15;
        if(idade < 16)
        System.out.println("Menor de idade não pode votar");

        else if(((idade > 15) && (idade < 18)) || (idade > 65))
        System.out.println("O voto é facultativo");

        else{
            System.out.println("O voto é obrigatório");
        }

    }
}