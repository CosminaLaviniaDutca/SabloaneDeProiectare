package models;

import services.Visitor;

import java.util.ArrayList;

public class TableOfContents implements Element {
        private String name;
        private ArrayList<String> elements = new ArrayList<String>();

        public TableOfContents(String name) {
            super();
            this.name = name;
        }
        public void print() {
            System.out.println("TableOfContents with name: " + name);
            for(String s: elements){
                if(s!=null){
                    System.out.println(s);
                }
            }
        }

        @Override
        public void add(Element e) throws Exception {

        }
        @Override
        public Element get(int poz) {
            return null;
        }
        @Override
        public void remove(Element e) {

        }
        @Override
        public boolean find(Element e) {
            return false;
        }

        @Override
        public void accept(Visitor v) {
            v.visitTableOfContents(this);
        }

        public void addEntry(String el){
            elements.add(el);
        }
}

