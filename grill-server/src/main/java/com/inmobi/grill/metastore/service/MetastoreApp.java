package com.inmobi.grill.metastore.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/metastore")
public class MetastoreApp extends Application {
  @Override
  public Set<Class<?>> getClasses() {
      final Set<Class<?>> classes = new HashSet<Class<?>>();
      // register root resource
      classes.add(MetastoreResource.class);
      return classes;
  }
}