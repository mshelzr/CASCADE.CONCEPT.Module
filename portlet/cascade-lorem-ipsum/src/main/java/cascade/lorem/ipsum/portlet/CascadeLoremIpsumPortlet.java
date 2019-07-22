package cascade.lorem.ipsum.portlet;

import cascade.lorem.ipsum.constants.CascadeLoremIpsumPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.StringPool;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author User
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + CascadeLoremIpsumPortletKeys.CascadeLoremIpsum,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CascadeLoremIpsumPortlet extends MVCPortlet {
	
	 public static String getParsedValue() {
		 return StringPool.BLANK;
	 }
	
}