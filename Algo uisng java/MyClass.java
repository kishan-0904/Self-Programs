import java.util.*;

public class MyClass {
 
 public static void main(String[] args) 
 {
  
  Scanner sc = new Scanner(System.in);
  
  Doctor d[]=new Doctor[4];
  
  for(int i=0;i<d.length;i++) 
  {
   int id=sc.nextInt();
   sc.nextLine();
   String name = sc.nextLine();
   double fee = sc.nextDouble();
   sc.nextLine();
   boolean avail=sc.nextBoolean();
   sc.nextLine();
   String dept = sc.nextLine();
   d[i] = new Doctor(id,name,fee,avail,dept);
  }
  
  String dp = sc.nextLine();
  
  double totalFee = findTotalFeeByDepartment(d, dp);
  
  if(totalFee == 0) {
   System.out.println("Department not found");
  }
  else {
   System.out.println(totalFee);
  }
  sc.close();
  ArrayList<Doctor> list =  searchDoctorByAvailability(d);
  if(list == null) {
   System.out.println("No doctor available on sunday");
  }
  else {
   list.forEach( id -> System.out.println(id.getId()));
  }
  
 }
 
 public static double findTotalFeeByDepartment(Doctor d[],String dept) {
  
  double total=0;
  
  for(Doctor i : d) {
   
   if(i.getDept().equalsIgnoreCase(dept)) {
    total += i.getFee();
   }
  }
  
  if(total == 0) {
   return 0;
  }
  else {
   return total;
  }
 }
 
 public static ArrayList<Doctor> searchDoctorByAvailability(Doctor d[]) {
  
  ArrayList<Doctor> list = new ArrayList<Doctor>();
  
  for(Doctor  i : d) {
   
   if(i.isAvailable()) {
    list.add(i);
   }
  }
  
  if(list.size() == 0) {
   return null;
  }
  else {
   Comparator<Doctor> mylist = Comparator.comparing(Doctor :: getId);
   Collections.sort(list,mylist);
   return list;
  }
  
 }
}

class Doctor{
 
 
 private int id;
 private String name;
 private double fee;
 boolean available;
 String dept;
 
 public Doctor(int id, String name, double fee,
   boolean available, String dept) {
  
  this.id = id;
  this.name = name;
  this.fee = fee;
  this.available = available;
  this.dept = dept;
 }

 public int getId() {
  return id;
 }

 public String getName() {
  return name;
 }

 public double getFee() {
  return fee;
 }

 public boolean isAvailable() {
  return available;
 }

 public String getDept() {
  return dept;
 }
 
 
 
 
 
}