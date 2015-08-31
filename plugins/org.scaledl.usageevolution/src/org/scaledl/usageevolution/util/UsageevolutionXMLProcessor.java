/**
 */
package org.scaledl.usageevolution.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class UsageevolutionXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsageevolutionXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		UsageevolutionPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the UsageevolutionResourceFactoryImpl factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION,
					new UsageevolutionResourceFactoryImpl());
			registrations.put(STAR_EXTENSION,
					new UsageevolutionResourceFactoryImpl());
		}
		return registrations;
	}

} // UsageevolutionXMLProcessor
