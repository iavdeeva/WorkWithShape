package ua.com.qalight;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	 
	public class Numbers {


		public static void main(String[] args) {
	        Reader read = new Reader();
	        String firstNumber = read.readNumber("Insert first number: ");
	        String secondNumber = read.readNumber("Insert sevond number: ");
	 
	        Calculate calc = new Calculate(firstNumber, secondNumber);
	        String answer = calc.multiplicationNumbers();
	 
	        System.out.println("Answer: " + answer);
	    }
	}
	 
	class Calculate {
	    private StringBuilder first;
	    private StringBuilder second;
	 
	    public Calculate(String firstNumber, String secondNumber) {
	        this.first = new StringBuilder(firstNumber);
	        this.second = new StringBuilder(secondNumber);
	    }
	 
	    public String multiplicationNumbers() {
	        List<StringBuilder> list = new ArrayList<>();
	        StringBuilder result = new StringBuilder();
	 
	        for (int index = second.length() - 1; index >= 0; index--) {
	            list.add(multiplication(this.first, second.charAt(index)));
	        }
	 
	        if (list.size() > 0) {
	            result.append(list.get(0));
	            for (int index = 1; index < list.size(); index++) {
	                 String end = result.substring(result.length() - index, result.length());
	                 result.setLength(result.length() - index);
	                 result = sum(result.toString(), list.get(index).toString());
	                 result.append(end);
	            }
	        }
	        
	        printResultMultiplication(list, result);
	        return result.toString();
	    }
	 
	    private StringBuilder multiplication(StringBuilder number, char digitChar) {
	        StringBuilder result = new StringBuilder();
	        int memory = 0;
	        int digit = Character.getNumericValue(digitChar);
	        for (int index = number.length() - 1; index >= 0; index--) {
	            int res = Character.getNumericValue(number.charAt(index)) * digit + memory;
	            memory = res / 10;
	            result.insert(0, res % 10);
	        }
	        if (memory != 0) {
	            result.insert(0, memory);
	        }
	        return result;
	    }
	 
	    private StringBuilder sum(String first, String second) {
	        StringBuilder result = new StringBuilder();
	        StringBuilder firstSB = new StringBuilder(first);
	        StringBuilder secondSB = new StringBuilder(second);
	        int memory = 0;
	        if (first.length() != second.length()) {
	            int zeros = Math.abs(first.length() - second.length());
	            for (int i = 0; i < zeros; i++) {
	                if (first.length() > second.length()) {
	                    secondSB.insert(0, "0");
	                } else {
	                    firstSB.insert(0, "0");
	                }
	            }
	        }
	 
	        for (int index = firstSB.length() - 1; index >= 0; index--) {
	            int res = Character.getNumericValue(firstSB.charAt(index)) + Character.getNumericValue(secondSB.charAt(index)) + memory;
	            memory = res / 10;
	            result.insert(0, res % 10);
	        }
	 
	        if (memory != 0) {
	            result.insert(0, memory);
	        }
	 
	        return result;
	    }
	 
	    private String getTabs(int amount, String symbol) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < amount; i++) {
	            result.append(symbol);
	        }
	        return result.toString();
	    }
	 
	    private int getMaxLength() {
	        return this.first.length() + this.second.length() + 2;
	    }
	 
	    private void printResultMultiplication(List<StringBuilder> list, StringBuilder result) {
	        System.out.printf("%s%s%s", getTabs(getMaxLength() - this.first.length(), " "), this.first, System.lineSeparator());
	        System.out.println("*");
	        System.out.printf("%s%s%s", getTabs(getMaxLength() - this.second.length(), " "), this.second, System.lineSeparator());
	        System.out.printf("%s%s", getTabs(getMaxLength(), "-"), System.lineSeparator());
	 
	        for (int index = 0; index < list.size(); index++) {
	            System.out.printf("%s%s%s", getTabs(getMaxLength() - list.get(index).length() - index, " "), list.get(index), System.lineSeparator());
	            if (index != list.size() - 1) {
	                System.out.println("+");
	            } else {
	                System.out.printf("%s%s", getTabs(getMaxLength(), "="), System.lineSeparator());
	            }
	        }
	        System.out.printf("%s%s%s", getTabs(getMaxLength() - result.length(), " "), result, System.lineSeparator());
	    }
	}
	 
	class Reader {
	    public String readNumber(String text) {
	        String result = "";
	        boolean correct = false;
	        Scanner read = new Scanner(System.in);
	        while (!correct) {
	            System.out.print(text);
	            result = read.nextLine().replaceAll(" ", "");
	            correct = checkCorrectNumber(result);
	            if (!correct) {
	                System.out.println("�� ����� ������������ �����. ���������� �����...");
	            }
	        }
	        return result;
	    }
	 
	    private boolean checkCorrectNumber(String number) {
	        return number.length() == number.replaceAll("[^\\d]", "").length();
	    }


	}


