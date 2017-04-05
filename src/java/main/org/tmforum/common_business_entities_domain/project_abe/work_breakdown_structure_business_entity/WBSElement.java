/**
* Work Breakdown Structure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536BA0009-content.html">Work Breakdown Structure ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.work_breakdown_structure_business_entity ;

/**
* A unique identifier for the WBS, usually defined as a structured set o 
* f numbers e.g. 1003.8842.36 may identify a level 3 WBS withing a Proje 
* ct. 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElement @since SID_R16.5
*/ 

public abstract class WBSElement extends ProjectElement {



/**  
* Field compoundWBSElement
*/
protected CompoundWBSElement compoundWBSElement ;




/**  
* Field project
*/
protected Project project ;




/**  
* Field businessDeliverable
*/
protected BusinessDeliverable businessDeliverable ;




/**  
* Field activity
*/
protected List<Activity> activity ;




/**  
* Field wBSElementSpec
*/
protected WBSElementSpec wBSElementSpec ;




/**  
* Field wbsNr
* A unique identifier for the WBS, usually defined as a structured set o 

* f numbers e.g. 1003.8842.36 may identify a level 3 WBS withing a Proje 

* ct. 

*/
protected String wbsNr ;




/**  
* Field wbsLevel
* The level that this WBS is in the Project's WBS hierarchy 

*/
protected Integer wbsLevel ;




/**  
* Field descr
*/
protected String descr ;




/**  
* Field projectResource
*/
protected ProjectResource projectResource ;


}