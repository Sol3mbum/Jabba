package org.juzu.tutorial;
import juzu.impl.request.ControllerHandler;
import juzu.impl.request.ControlParameter;
import juzu.impl.request.PhaseParameter;
import juzu.impl.request.ContextualParameter;
import juzu.impl.request.BeanParameter;
import juzu.impl.common.Tools;
import java.util.Arrays;
import juzu.request.Phase;
import juzu.impl.plugin.controller.descriptor.ControllerDescriptor;
import javax.annotation.Generated;
import juzu.impl.common.Cardinality;
import juzu.impl.request.Request;
@Generated(value={})
public class JuZcretApplication_ {
private static final Class<org.juzu.tutorial.JuZcretApplication> TYPE = org.juzu.tutorial.JuZcretApplication.class;
private static final ControllerHandler<Phase.Resource> method_0 = new ControllerHandler<Phase.Resource>("JuZcretApplication.addLike",Phase.RESOURCE,TYPE,Tools.safeGetMethod(TYPE,"addLike",java.lang.String.class,juzu.request.SecurityContext.class), Arrays.<ControlParameter>asList(new PhaseParameter("secretId",java.lang.String.class,java.lang.String.class,Cardinality.SINGLE,null),new ContextualParameter("context",juzu.request.SecurityContext.class)));
public static Phase.Resource.Dispatch addLike(java.lang.String secretId) { return Request.createResourceDispatch(method_0,(Object)secretId); }
private static final ControllerHandler<Phase.Resource> method_1 = new ControllerHandler<Phase.Resource>("JuZcretApplication.addComment",Phase.RESOURCE,TYPE,Tools.safeGetMethod(TYPE,"addComment",java.lang.String.class,org.juzu.tutorial.models.Comment.class,juzu.request.SecurityContext.class), Arrays.<ControlParameter>asList(new PhaseParameter("secretId",java.lang.String.class,java.lang.String.class,Cardinality.SINGLE,null),new BeanParameter("comment",org.juzu.tutorial.models.Comment.class),new ContextualParameter("context",juzu.request.SecurityContext.class)));
public static Phase.Resource.Dispatch addComment(java.lang.String secretId,org.juzu.tutorial.models.Comment comment) { return Request.createResourceDispatch(method_1,new Object[]{secretId,comment}); }
private static final ControllerHandler<Phase.View> method_2 = new ControllerHandler<Phase.View>("JuZcretApplication.addSecretForm",Phase.VIEW,TYPE,Tools.safeGetMethod(TYPE,"addSecretForm"), Arrays.<ControlParameter>asList());
public static Phase.View.Dispatch addSecretForm() { return Request.createViewDispatch(method_2); }
private static final ControllerHandler<Phase.View> method_3 = new ControllerHandler<Phase.View>("JuZcretApplication.index",Phase.VIEW,TYPE,Tools.safeGetMethod(TYPE,"index",juzu.request.RequestContext.class), Arrays.<ControlParameter>asList(new ContextualParameter("context",juzu.request.RequestContext.class)));
public static Phase.View.Dispatch index() { return Request.createViewDispatch(method_3); }
private static final ControllerHandler<Phase.Action> method_4 = new ControllerHandler<Phase.Action>("JuZcretApplication.addSecret",Phase.ACTION,TYPE,Tools.safeGetMethod(TYPE,"addSecret",java.lang.String.class,java.lang.String.class), Arrays.<ControlParameter>asList(new PhaseParameter("msg",java.lang.String.class,java.lang.String.class,Cardinality.SINGLE,null),new PhaseParameter("imgURL",java.lang.String.class,java.lang.String.class,Cardinality.SINGLE,null)));
public static Phase.Action.Dispatch addSecret(java.lang.String msg,java.lang.String imgURL) { return Request.createActionDispatch(method_4,new Object[]{msg,imgURL}); }
private static final ControllerHandler<Phase.Action> method_5 = new ControllerHandler<Phase.Action>("JuZcretApplication.enableComment",Phase.ACTION,TYPE,Tools.safeGetMethod(TYPE,"enableComment",java.lang.String.class), Arrays.<ControlParameter>asList(new PhaseParameter("enableComment",java.lang.String.class,java.lang.String.class,Cardinality.SINGLE,null)));
public static Phase.Action.Dispatch enableComment(java.lang.String enableComment) { return Request.createActionDispatch(method_5,(Object)enableComment); }
public static final ControllerDescriptor DESCRIPTOR = new ControllerDescriptor(TYPE,Arrays.<ControllerHandler<?>>asList(method_0,method_1,method_2,method_3,method_4,method_5));
}
