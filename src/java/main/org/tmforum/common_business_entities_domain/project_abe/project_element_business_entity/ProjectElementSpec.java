/**
* Project Element ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF53744030A-content.html">Project Element ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.project_element_business_entity ;

/**
* Specifies characteristics that apply to types of ProjectElements. This 
*  is an abstract entity used to hold the attributes and associations co 
* mmon to ProjectSpecification, WBS ElementSpecification and ActivitySpe 
* cification. These entities can be used to build standard project templ 
* ates to aid in Project creation. 
 @since SID_R16.5
*/ 

public abstract class ProjectElementSpec  {



/**  
* Field projectElement
*/
protected List<ProjectElement> projectElement ;




/**  
* Field name
* short text allowing for easy identification of the element specificati 

* on 

*/
protected String name ;




/**  
* Field description
* descriptive text about the specification 

*/
protected String description ;




/**  
* Field expectedDuration
* the normal duration of this standard element 

*/
protected Duration expectedDuration ;




/**  
* Field type
*/
protected String type ;


}