package Graph;

public class test {
	public static void main(String[] args) {
		Graph<Integer, Integer> g = new GraphListDirected<>();
		g.add(1);
		g.add(2);
		g.add(10);
		g.add(5);
		g.add(7);
		g.add(17);
		g.add(21);
		g.add(51);

		g.addEdge(1, 2, null);
		g.addEdge(1, 10, null);
		g.addEdge(2, 10, null);
		g.addEdge(2, 5, null);
		g.addEdge(5, 17, null);
		g.addEdge(10, 7, null);
		g.addEdge(5, 21, null);
		g.addEdge(5, 51, null);
		g.addEdge(7, 51, null);

		g.DFS(1);
		g.BFS(1);
		System.out.println(g);
	}
}
