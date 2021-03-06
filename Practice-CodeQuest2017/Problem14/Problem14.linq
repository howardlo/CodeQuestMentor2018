<Query Kind="Program">
  <Reference>&lt;RuntimeDirectory&gt;\System.Xml.Serialization.dll</Reference>
  <Namespace>System</Namespace>
  <Namespace>System.Collections.Generic</Namespace>
  <Namespace>System.IO</Namespace>
  <Namespace>System.Xml.Serialization</Namespace>
</Query>

class Program
{
	static void Main(string[] args)
	{
		Console.WriteLine("Problem 14");
		var lines = File.ReadAllLines("./Prob14.in.txt");
		var n = int.Parse(lines[0]);
		Console.WriteLine($"n: {n}");

		Tree<string, string> tree = new Tree<string, string>();

		for (var i = 0; i < n; i++)
		{
			var txt = lines[1 + i];
			var token = txt.Split(',');
			var product = token[0];
			var parentProduct = token[1];
			Console.WriteLine($"product: {product} | parent: {parentProduct}");

			if (parentProduct == "None")
			{
				tree = new Tree<string, string>();
				tree.Add(parentProduct, new Tree<string, string> { Value = product});
			}
			else
			{
				// tree.Add( new Tree<string, string> { Value = product};
				// tree.Add( new Tree<string, string> { Value = product};
			}
		}
		
		
		tree.Dump();
	}
}


public class Tree<K, V> : Dictionary<K, Tree<K, V>>
{
	public V Value { get; set; }
}