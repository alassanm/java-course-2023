package java2023.day3;

//Node Class
class Node {
 private double x;
 private double y;
 private String id;

 public Node(double x, double y, String id) {
     this.x = x;
     this.y = y;
     this.id = id;
 }

 public double getX() {
     return x;
 }

 public double getY() {
     return y;
 }

 public String getId() {
     return id;
 }
}

//Link Class
class Link {
 private Node fromNode;
 private Node toNode;
 private String id;
 private String[] modes;
 private double length;
 private int allowedSpeed;
 private double capacity;

 public Link(Node fromNode, Node toNode, String id, String[] modes, double length, int allowedSpeed, double capacity) {
     this.fromNode = fromNode;
     this.toNode = toNode;
     this.id = id;
     this.modes = modes;
     this.length = length;
     this.allowedSpeed = allowedSpeed;
     this.capacity = capacity;
 }

 public Node getFromNode() {
     return fromNode;
 }

 public Node getToNode() {
     return toNode;
 }

 public String getId() {
     return id;
 }

 public String[] getModes() {
     return modes;
 }

 public double getLength() {
     return length;
 }

 public int getAllowedSpeed() {
     return allowedSpeed;
 }

 public double getCapacity() {
     return capacity;
 }
}

//Network Class
class Network {
 private Node[] nodes;
 private Link[] links;

 public Network(Node[] nodes, Link[] links) {
     this.nodes = nodes;
     this.links = links;
 }

 public Node[] getNodes() {
     return nodes;
 }

 public Link[] getLinks() {
     return links;
 }
}

//Test Network Class
public class Q3 {
 public static void main(String[] args) {
     Node n1 = new Node(0, 0, "n1");
     Node n2 = new Node(0, 1, "n2");
     Node n3 = new Node(1, 0, "n3");
     Node n4 = new Node(1, 1, "n4");

     Link l1 = new Link(n1, n2, "l1", new String[]{"car", "bike"}, 1.0, 60, 1000);
     Link l2 = new Link(n2, n4, "l2", new String[]{"car", "bike"}, 1.0, 60, 1000);
     Link l3 = new Link(n4, n3, "l3", new String[]{"car", "bike"}, 1.0, 60, 1000);
     Link l4 = new Link(n3, n1, "l4", new String[]{"car", "bike"}, 1.0, 60, 1000);

     Node[] nodes = {n1, n2, n3, n4};
     Link[] links = {l1, l2, l3, l4};

     Network network = new Network(nodes, links);

     // Display the coordinates of all nodes contained in the network
     for (Node node : network.getNodes()) {
         System.out.println("Node ID: " + node.getId() + ", X: " + node.getX() + ", Y: " + node.getY());
     }
 }
}

