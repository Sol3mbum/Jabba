package org.juzu.tutorial.templates;
import juzu.impl.plugin.template.metadata.TemplateDescriptor;
import juzu.impl.plugin.template.TemplateService;
@javax.annotation.Generated({})
public class addSecret extends juzu.template.Template
{
@javax.inject.Inject
public addSecret(TemplateService templatePlugin)
{
super(templatePlugin, "/org/juzu/tutorial/templates/addSecret.gtmpl");
}
public static final juzu.impl.plugin.template.metadata.TemplateDescriptor DESCRIPTOR = new juzu.impl.plugin.template.metadata.TemplateDescriptor("/org/juzu/tutorial/templates/addSecret.gtmpl",0xec6cea980ea3c5d7L,org.juzu.tutorial.templates.addSecret.class,juzu.impl.template.spi.juzu.dialect.gtmpl.GroovyTemplateStub.class);
public Builder builder() {
return new Builder();
}
public Builder with() {
return (Builder)super.with();
}
public class Builder extends juzu.template.Template.Builder
{
}
}
