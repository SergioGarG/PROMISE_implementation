package se.gu.co4robots.xtext.promise.generator;

import java.util.ArrayList;

@SuppressWarnings("all")
public class robotClass {
  public String name;
  
  public ArrayList<String> missionList;
  
  public int indentation;
  
  public robotClass(final String name, final ArrayList<String> missionList, final int indentation) {
    this.name = name;
    this.missionList = missionList;
    this.indentation = indentation;
  }
}
