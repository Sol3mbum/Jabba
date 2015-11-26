package org.juzu.tutorial.templates;
; def closure0 = { ; } as juzu.template.Renderable;out.renderContext.renderTag('juzu.impl.tags.ParamTag',closure0,["name":"enableComment".toString()]);;out.print(org.juzu.tutorial.templates.CeditMode.s0);
;out.print(org.juzu.tutorial.JuZcretApplication_.enableComment(null));;out.print(org.juzu.tutorial.templates.CeditMode.s1);
out.print(org.juzu.tutorial.templates.CeditMode.m0);
;out.print(org.juzu.tutorial.templates.CeditMode.s2);
;out.print("${enableComment ? "checked" : "" }");
;out.print(org.juzu.tutorial.templates.CeditMode.s3);
out.print(org.juzu.tutorial.templates.CeditMode.m1);
;out.print(org.juzu.tutorial.templates.CeditMode.s4);
out.print(org.juzu.tutorial.templates.CeditMode.m2);
;out.print(org.juzu.tutorial.templates.CeditMode.s5);

public class CeditMode
{
public static final String s0 = '\n\n<form action="';
public static final String s1 = '" method="POST" role="form">\n	<h5>';
public static final String s2 = '</h5>\n	<input type="checkbox" name="enableComment" ';
public static final String s3 = '/>';
public static final String s4 = '\n	<button type="submit">';
public static final String s5 = '</button>\n</form>';
public static final juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey m0 = new juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey('label.configuration');
public static final juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey m1 = new juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey('label.enableComment');
public static final juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey m2 = new juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey('label.save');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
5:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(53,5),'enableComment ? "checked" : "" ')];
}
