package org.juzu.tutorial.templates;
import juzu.impl.plugin.template.metadata.TemplateDescriptor;
import juzu.impl.plugin.template.TemplateService;
@javax.annotation.Generated({})
public class editMode extends juzu.template.Template
{
@javax.inject.Inject
public editMode(TemplateService templatePlugin)
{
super(templatePlugin, "/org/juzu/tutorial/templates/editMode.gtmpl");
}
public static final juzu.impl.plugin.template.metadata.TemplateDescriptor DESCRIPTOR = new juzu.impl.plugin.template.metadata.TemplateDescriptor("/org/juzu/tutorial/templates/editMode.gtmpl",0xa0b48ba45c00d897L,org.juzu.tutorial.templates.editMode.class,juzu.impl.template.spi.juzu.dialect.gtmpl.GroovyTemplateStub.class);
public Builder builder() {
return new Builder();
}
public Builder with() {
return (Builder)super.with();
}
public class Builder extends juzu.template.Template.Builder
{
public Builder enableComment(Object enableComment) {
set("enableComment",enableComment);
return this;
}
}
}
