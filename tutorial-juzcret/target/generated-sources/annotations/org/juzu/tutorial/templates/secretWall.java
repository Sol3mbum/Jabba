package org.juzu.tutorial.templates;
import juzu.impl.plugin.template.metadata.TemplateDescriptor;
import juzu.impl.plugin.template.TemplateService;
@javax.annotation.Generated({})
public class secretWall extends juzu.template.Template
{
@javax.inject.Inject
public secretWall(TemplateService templatePlugin)
{
super(templatePlugin, "/org/juzu/tutorial/templates/secretWall.gtmpl");
}
public static final juzu.impl.plugin.template.metadata.TemplateDescriptor DESCRIPTOR = new juzu.impl.plugin.template.metadata.TemplateDescriptor("/org/juzu/tutorial/templates/secretWall.gtmpl",0x52771af98928cc99L,org.juzu.tutorial.templates.secretWall.class,juzu.impl.template.spi.juzu.dialect.gtmpl.GroovyTemplateStub.class);
public Builder builder() {
return new Builder();
}
public Builder with() {
return (Builder)super.with();
}
public class Builder extends juzu.template.Template.Builder
{
public Builder secretsList(Object secretsList) {
set("secretsList",secretsList);
return this;
}
public Builder enableComment(Object enableComment) {
set("enableComment",enableComment);
return this;
}
}
}
