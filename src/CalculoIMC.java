import java.util.Locale;
import java.util.Scanner; 

public class CalculoIMC {
   
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Insira sua altura");
    float altura = scanner.nextFloat();
    
    System.out.println("Insira seu peso");
    int peso = scanner.nextInt();
    
    float alturaQuadrada = altura * altura;
    float calculoIMC = peso / alturaQuadrada;
    
    System.out.printf("%.1f\n" ,calculoIMC);

    if  (calculoIMC <= 18.5) {
        System.out.println("Abaixo do peso");
    } 
    
    else if  (calculoIMC > 18.5 && calculoIMC <= 24.9) {
        System.out.println("Peso ideal");
    } 
    
    else if  (calculoIMC > 24.9 && calculoIMC <= 29.9){
        System.out.println("Levemente acima do peso");
    } 

    else if  (calculoIMC > 29.9 && calculoIMC <= 34.9){
        System.out.println("Obesidade grau I");
    } 

    else if  (calculoIMC > 34.9 && calculoIMC <= 39.9){
        System.out.println("Obesidade grau II");
    } 

    else {
        System.out.println("Obseidade grau III");
    } 
}
}

