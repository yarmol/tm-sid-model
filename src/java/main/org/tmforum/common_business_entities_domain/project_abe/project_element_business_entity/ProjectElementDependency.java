/**
* Project Element ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF53744030A-content.html">Project Element ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_element_business_entity ;

/**
* This allows us to show dependencies, that typically relate to a Projec 
* tElement not being able to commence until another Element has been com 
* pleted. 
 @since SID_R16.5
*/ 

public  class ProjectElementDependency  {



/**  
* Field dependencyType
* the relationship to be applied between the start or end points of the  

* project elements (refer table 2)</br></br>Notes: see [PSL] 

*/
protected String dependencyType ;




/**  
* Field lead
* the time lead to be applied to the dependency</br></br>Notes: May be z 

* ero 

*/
protected Duration lead ;




/**  
* Field lag
* the time lag to be applied to the dependency</br></br>Notes: May be ze 

* ro 

*/
protected Duration lag ;


}