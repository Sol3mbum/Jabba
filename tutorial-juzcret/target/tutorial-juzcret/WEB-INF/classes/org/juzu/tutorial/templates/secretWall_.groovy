package org.juzu.tutorial.templates;
; def closure0 = { ; } as juzu.template.Renderable;out.renderContext.renderTag('juzu.impl.tags.ParamTag',closure0,["name":"secretsList".toString()]);;out.print(org.juzu.tutorial.templates.CsecretWall.s0);
; def closure1 = { ; } as juzu.template.Renderable;out.renderContext.renderTag('juzu.impl.tags.ParamTag',closure1,["name":"enableComment".toString()]);;out.print(org.juzu.tutorial.templates.CsecretWall.s1);
;out.print(org.juzu.tutorial.JuZcretApplication_.addSecretForm());;out.print(org.juzu.tutorial.templates.CsecretWall.s2);
out.print(org.juzu.tutorial.templates.CsecretWall.m0);
;out.print(org.juzu.tutorial.templates.CsecretWall.s3);
 secretsList.each { secret -> 
;out.print(org.juzu.tutorial.templates.CsecretWall.s4);
;out.print("${secret.id}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s5);
;out.print("${secret.imageURL}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s6);
;out.print("${secret.message}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s7);
 secret.getComments().each { comment -> 
;out.print(org.juzu.tutorial.templates.CsecretWall.s8);
;out.print("${comment.userId}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s9);
;out.print("${comment.userId}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s10);
;out.print("${comment.userId}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s11);
;out.print("${comment.createdDate}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s12);
;out.print("${comment.content}");
;out.print(org.juzu.tutorial.templates.CsecretWall.s13);
 } 
;out.print(org.juzu.tutorial.templates.CsecretWall.s14);
out.print(org.juzu.tutorial.templates.CsecretWall.m1);
;out.print(org.juzu.tutorial.templates.CsecretWall.s15);
out.print(org.juzu.tutorial.templates.CsecretWall.m2);
;out.print(org.juzu.tutorial.templates.CsecretWall.s16);
 } 
;out.print(org.juzu.tutorial.templates.CsecretWall.s17);

public class CsecretWall
{
public static final String s0 = '\n';
public static final String s1 = '\n\n<div class="secret-wall-container">\n	<div class="secret-wall-heading">\n		<div class="row-fluid">\n			<div class="span6">\n				<h3 class="title">JuZcret Portlet</h3>\n			</div>\n\n			<div class="span6 text-right">\n				<a class="btn btn-primary" href="';
public static final String s2 = '" role="button">';
public static final String s3 = '</a>\n			</div>\n		</div>\n	</div>\n	<ul class="secret-wall-list clearfix">\n		';
public static final String s4 = '\n		<li class="secret" data-secretId="';
public static final String s5 = '">\n			<div class="secret-image" style="background-image: url(\'';
public static final String s6 = '\')">\n\n				<div class="secret-mesage">';
public static final String s7 = '</div>\n\n				<div class="secret-action">\n					<a class="btn-like secr-toggle-link toggle-like-comment" href="#">\n						<i class="uiIconThumbUp uiIconWhite"></i><span class="numb"></span>\n					</a>\n                    <a class="btn-popup-comment secr-toggle-link toggle-write-comment" href="#">\n                    	<i class="uiIconComment uiIconWhite"></i><span class="numb"></span>\n					</a>\n				</div>\n\n				<div class="popover popover-secret fade top">\n					<button class="closePopover close" type="button">&times;</button>\n					<div class="arrow"></div>\n\n					<div class="popover-content">\n						<div class="secr-comments-box">\n							<ul class="secr-comments-list">\n								';
public static final String s8 = '\n								<li><!--Add class .open-popover to display popover -->\n									<div class="media">\n										<a class="pull-left" href="http://localhost:8080/portal/intranet/profile/';
public static final String s9 = '">\n											<img src="http://localhost:8080/social-resources/skin/images/ShareImages/UserAvtDefault.png" alt="avatar">\n										</a>\n\n										<div class="media-body">\n											<div>\n												<a class="cm-user-name" href="http://localhost:8080/portal/intranet/profile/';
public static final String s10 = '">';
public static final String s11 = '</a> <span class="cm-time">';
public static final String s12 = '</span>\n											</div>\n\n											<div class="cm-content">';
public static final String s13 = '</div>\n										</div>\n									</div>\n								</li>\n								';
public static final String s14 = '\n							</ul>\n						</div>\n						<div class="secr-create-comment clearfix">\n							<butx``ton class="btn-comment btn btn-primary pull-right">';
public static final String s15 = '</button>\n\n							<div class="secr-write-comment ">\n								<div class="inner">\n									<div class="media">\n										<a href="#" class="pull-left">\n											<img src="http://localhost:8080/social-resources/skin/images/ShareImages/UserAvtDefault.png" alt="avatar">\n										</a>\n\n										<div class="media-body">\n											<textarea name="comment" class="secret-add-comment" placeholder="';
public static final String s16 = '"></textarea>\n										</div>\n									</div>\n								</div>\n							</div>\n						</div>\n					</div>\n				</div>\n			</div>\n		</li>\n		';
public static final String s17 = '\n	</ul>\n</div>';
public static final juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey m0 = new juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey('label.shareSecret');
public static final juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey m1 = new juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey('label.comment');
public static final juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey m2 = new juzu.impl.template.spi.juzu.dialect.gtmpl.MessageKey('label.addComment');
public static final Map<Integer, juzu.impl.template.spi.juzu.dialect.gtmpl.Foo> TABLE = [
16:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(154,42),'comment.userId'),
18:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(173,48),'comment.userId'),
20:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(192,48),'comment.userId'),
6:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(17,17),' secretsList.each { secret -> '),
22:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(236,48),'comment.createdDate'),
8:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(51,18),'secret.id'),
24:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(113,51),'comment.content'),
10:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(81,19),'secret.imageURL'),
26:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(65,55),' } '),
12:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(60,21),'secret.message'),
14:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(65,39),' secret.getComments().each { comment -> '),
30:new juzu.impl.template.spi.juzu.dialect.gtmpl.Foo(new juzu.impl.common.Location(17,79),' } ')];
}
