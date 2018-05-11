package com.taxSoapWebService.test.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Solution {

    static String isValid(String email) {
        if(email==null) return "NO";
        if(email.isEmpty()|| email.length() > 100) return "NO";
        if(!email.contains("@")) return "No";
        String[] emailDetails = email.split("@");
        if(emailDetails.length>2) return "NO";
        String emailPrefix = email.split("@")[0];
        if(emailPrefix.length()>5)return "NO";
        if(!emailPrefix.equals(emailPrefix.toLowerCase())) return "NO";
        if(!"hogwarts.com".equals(emailDetails[1]))return "NO";
        return "YES";
    }

    public static void domain(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
        int index = 0;
        for(Integer i: list){
            map.put(index,i);
            index++;
        }

        List<Integer> newList = new ArrayList<>(n);
        for(Integer i: map.keySet()){
            Integer newIndex = (i+k)%n;
            newList.set(newIndex,(Integer)map.get(i));
        }

        newList.forEach(item->System.out.print(item));

    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int aliceScore = 0;
        int bobScore = 0;

        if(a0>b0){
            aliceScore = aliceScore + 1;
        }else if(a0 < b0) {
            bobScore = bobScore + 1;
        }else{

        }
        if(a1>b1){
            aliceScore = aliceScore + 1;
        }else if(a1 < b1) {
            bobScore = bobScore + 1;
        }else {
        }
        if(a2>b2){
            aliceScore = aliceScore + 1;
        }else if(a2 < b2) {
            bobScore = bobScore + 1;
        }else{

        }
        int[] scores = new int[2];
        scores[0] = aliceScore;
        scores[1] = bobScore;
        return scores;
    }


    static long aVeryBigSum(int n, long[] ar) {
        List<Long> numbers = LongStream.of(ar).boxed().collect(Collectors.toList());
        return numbers.parallelStream().reduce(Long::sum).get();
    }

    public static void welcome(String[] args) throws Exception{
     //   Scanner in = new Scanner(System.in);
     //   String s = in.next();
        String str = "07:05:45PM";
        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        System.out.println(date24Format.format(date12Format.parse(str)));

    }


    static int[] solve(int[] grades){

        for(int i=0;i<grades.length;i++){

            if(grades[i]<38){
                continue;
            }
            else{
               grades[i] = (int) (Math.ceil(grades[i]));

            }

        }



        return  grades;
    }

    static void apples(){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
            int appleCount =0;
            int orangeCount =0;
        for(int apples=0;apples<apple.length;apples++){
            if(apple[apples]+a>=s&&apple[apples]+a<=t){
                appleCount++;
            }
        }
        for(int oranges=0;oranges<orange.length;oranges++){
            if(orange[oranges]+b<=s&&orange[oranges]+b>=t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }


    /*static int getTotalX(int[] a, int[] b) {
       List<Integer> setA =IntStream.of(a).boxed().collect(Collectors.toList());
        List<Integer> setB =IntStream.of(b).boxed().collect(Collectors.toList());
        int minSetB = setA.stream().mapToInt(m->m).min().getAsInt();
        List<Integer> integers = primeFactors(minSetB);
        List<Integer> finalList =  new ArrayList<>();
        integers.forEach(x->{




        });

        return 2;
    }
*/

    public static void main(String[] args) {
       main1();
    }


    public static void Test(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        List<Integer> numbers = IntStream.of(arr).boxed().collect(Collectors.toList());
        List<Integer> sumList1 = new ArrayList<>(numbers);
        List<Integer> sumList2 = new ArrayList<>(numbers);;
        List<Integer> sumList3 = new ArrayList<>(numbers);;
        List<Integer> sumList4 = new ArrayList<>(numbers);;
        List<Integer> sumList5 = new ArrayList<>(numbers);;
        List<Long> sumList = new ArrayList<>();
        sumList1.remove(0);
        sumList2.remove(1);
        sumList3.remove(2);
        sumList4.remove(3);
        sumList5.remove(4);
        sumList.add(sumList1.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList2.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList3.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList4.stream().reduce(Integer::sum).get().longValue());
        sumList.add(sumList5.stream().reduce(Integer::sum).get().longValue());
        Long maxSum = new Long(sumList.stream().mapToInt(Long::intValue).max().getAsInt());
        Long minSum = new Long(sumList.stream().mapToInt(Long::intValue).min().getAsInt());
        System.out.println(minSum+" "+maxSum);

    }


    public static void printSequence(String s, int repeats) {
        for(int i=0; i<repeats; i++) {
            System.out.print(s);
        }
    }

    static List<String> solve(String s, int k) {

        String finalSubSeq = "";
        String mainString = s;
        String[] chars = s.split("");
        String[] findIndices = s.split("");
        Arrays.sort(chars);
        List<String> letters = Arrays.asList(chars);
        for (String check : letters) {
            String firstlexi = letters.get(letters.size() - 1);
            int occurances = s.length() - mainString.replaceAll(firstlexi, "").length();
            if (findEligibilty(occurances, k)) {
                int[] indices = IntStream.range(0, s.length()).filter(i -> firstlexi.equalsIgnoreCase(findIndices[i])).toArray();
                for (int index = 0; index < indices.length; index++) {
                    finalSubSeq.concat(firstlexi);
                }

            }
            return letters;

        }
        return letters;
    }

    static boolean findEligibilty(int count , int elgible ){
        return count >= elgible;

    }

    static int stockPurchaseDay(List<Integer> stocks, int xi) {
        int lastStock = stocks.lastIndexOf(xi);
        if(lastStock==-1) return lastStock;
        return lastStock+1;
    }
    static void findSubstring(){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> stocks = new ArrayList<>();
        for(int A_i = 0; A_i < n; A_i++){
            stocks.add(in.nextInt());
        }
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int xi = in.nextInt();
            int result = stockPurchaseDay(stocks, xi);
            System.out.println(result);
        }
        in.close();
    }




    static int howManyGames(int p, int d, int m, int s) {

        int noOfGames = 0;

        if (s < p) {
            return 0;
        } else if (s == p) {
            return 1;
        } else {

            noOfGames++;
            int remaingAmount = s - p;
            while (p > m) {
                p = p-d;
                remaingAmount = remaingAmount - p;
                noOfGames++;
            }
            noOfGames = noOfGames + remaingAmount /m;

        }
        return noOfGames;
    }


    public static void main1() {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double m = in.nextDouble();

        List<Double> allPrimesPowers = new ArrayList<>();
        for(int i=2;i<=n;i++){

            if(isPrime(i)){
                allPrimesPowers.add(Math.pow(i,m));
            }


        }
        int counter = 0;
        for(double i=1;i<=n;i++){
            for(int p=0;p<allPrimesPowers.size();p++){
                if(i%allPrimesPowers.get(p)==0) {
                    counter ++;
                    break;
                }
            }
        }
        System.out.println((int) n-counter);
        in.close();
    }

    public static boolean isPrime(double num){
        if ( num > 2 && num%2 == 0 ) return false;
        double top = (double)Math.sqrt(num) + 1;
        for(double i = 3; i < top; i+=2){
            if(num % i == 0) return false;

        }
        return true;
    }


}

