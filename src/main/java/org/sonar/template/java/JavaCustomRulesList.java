package org.sonar.template.java;

import java.util.List;

import org.sonar.plugins.java.api.JavaCheck;

import com.google.common.collect.ImmutableList;
import com.juliasoft.sonarqube.plugin.AvoidRecursiveCallsPlugin;
import com.juliasoft.sonarqube.plugin.GandalfRulePlugin;

public final class JavaCustomRulesList {

  private JavaCustomRulesList() {
  }

  public static List<Class> getChecks() {
    return ImmutableList.<Class>builder().addAll(getJavaChecks()).addAll(getJavaTestChecks()).build();
  }

  public static List<Class<? extends JavaCheck>> getJavaChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
    		.add(AvoidRecursiveCallsPlugin.class)
    		.add(GandalfRulePlugin.class)
      // add HERE rules targeting source files
      .build();
  }

  public static List<Class<? extends JavaCheck>> getJavaTestChecks() {
    return ImmutableList.<Class<? extends JavaCheck>>builder()
      // add HERE rules targeting test files
      .build();
  }
}
