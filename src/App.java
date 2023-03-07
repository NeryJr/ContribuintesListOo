import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();

        List <TaxPayer> list = new ArrayList<>();
        TaxPayer collaborator = new TaxPayer();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Digite os dados do %do contribuinte: %n", i+1);
            System.out.print("Renda anual com salário: ");
            Double salary = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            Double service = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            Double capital = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            Double medicine = sc.nextDouble();
            System.out.print("Gastos com educação: ");
            Double educ = sc.nextDouble();

            collaborator = new TaxPayer(salary, service, capital, medicine, educ );
            list.add(collaborator);
        }

       for (TaxPayer resume : list) {
            System.out.println();
            System.out.printf("Resumo do %do contribuinte: %n", list.indexOf(resume)+1);
            System.out.println(resume);
       }

        sc.close();
    }
}