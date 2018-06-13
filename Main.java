/*
 * Author : Lohith Nimmala
 * Course : CIS 675
 * Grand Valley State University
 * 
 */

import org.antlr.runtime.CharStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.TestRig;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.print.PrintException;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Future;


public class Main {
	
	public static void main( String[] args) throws Exception 
    {
       org.antlr.v4.runtime.CharStream charStream = CharStreams.fromFileName("input.txt");
        DOTLexer lexer = new DOTLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DOTParser parser = new DOTParser(tokens);
        ParseTree tree = parser.graph(); // begin parsing at rule 'graph'
        System.out.println("Printing ASTree"); // print LISP-style tree
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
        //List<String> ruleNames = parser != null ? Arrays.asList(parser.getRuleNames()) : null;
        //Command to generate AST image
         //Trees.inspect(tree, parser);
        
        //this will be input for treewalker to analysis the ASTree
        String treewalker = tree.toStringTree(parser);
    }
}
