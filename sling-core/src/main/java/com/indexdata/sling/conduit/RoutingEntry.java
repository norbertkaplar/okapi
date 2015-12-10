/*
 * Copyright (c) 1995-2015, Index Data
 * All rights reserved.
 * See the file LICENSE for details.
 */
package com.indexdata.sling.conduit;

public class RoutingEntry {
  private String[] methods;
  private String path;

  public String[] getMethods() {
    return methods;
  }

  public String getPath() {
    return path;
  }

  public void setMethods(String[] methods) {
    this.methods = methods;
  }

  public void setPath(String path) {
    this.path = path;
  }
  
}