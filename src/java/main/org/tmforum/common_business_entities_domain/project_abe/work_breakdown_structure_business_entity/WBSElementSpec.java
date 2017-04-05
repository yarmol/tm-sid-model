/**
* Work Breakdown Structure ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536BA0009-content.html">Work Breakdown Structure ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.work_breakdown_structure_business_entity ;

/**
* Specifies characteristics that apply to types of WBS Elements 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElementSpec @since SID_R16.5
*/ 

public  class WBSElementSpec extends ProjectElementSpec {



/**  
* Field compoundWBSSpec
*/
protected CompoundWBSSpec compoundWBSSpec ;




/**  
* Field projectSpec
*/
protected List<ProjectSpec> projectSpec ;




/**  
* Field projectSpec1
*/
protected List<ProjectSpec> projectSpec1 ;




/**  
* Field wBSElement
*/
protected List<WBSElement> wBSElement ;




/**  
* Field activitySpec
*/
protected List<ActivitySpec> activitySpec ;




/**  
* Field activitySpecCostParameter
*/
protected ActivitySpecCostParameter activitySpecCostParameter ;




/**  
* Field resourceSpecCostParameter
*/
protected ResourceSpecCostParameter resourceSpecCostParameter ;


}