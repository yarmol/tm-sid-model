/**
* WorkSpecification ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_I1020N.mZE.eC.z9.a.o.eR.f.u.g.hA-content.html">WorkSpecification ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.enterprise_domain.workforce_abe.workspecification_business_entity ;

/**
* A classification that groups WorkSpecifications that share common char 
* acteristics. For example, Equipment maintenance work type, or network  
* trouble shooting type. This class can be used to present a “Catalog” o 
* f work specifications. 
 @since SID_R16.5
*/ 

public  class WorkSpecificationType  {



/**  
* Field workSpecification
*/
protected List<WorkSpecification> workSpecification ;




/**  
* Field type
* The name of the type of WorkSpecification, used to group or catalog th 

* e works. For example, type can be ServiceInstallation Works, Infrastru 

* cture Works, etc. 

*/
protected String type ;


}