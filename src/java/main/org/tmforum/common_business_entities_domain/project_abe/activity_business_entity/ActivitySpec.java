/**
* Activity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536ED0125-content.html">Activity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.activity_business_entity ;

/**
* Specifies characteristics that apply to types of Activities 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElementSpec @since SID_R16.5
*/ 

public  class ActivitySpec extends ProjectElementSpec {



/**  
* Field activity
*/
protected List<Activity> activity ;




/**  
* Field performanceMeasure
*/
protected PerformanceMeasure performanceMeasure ;




/**  
* Field activitySpecCostParameter
*/
protected List<ActivitySpecCostParameter> activitySpecCostParameter ;




/**  
* Field resourceSpecCostParameter
*/
protected List<ResourceSpecCostParameter> resourceSpecCostParameter ;




/**  
* Field projectResourceSpec
*/
protected List<ProjectResourceSpec> projectResourceSpec ;




/**  
* Field compoundActivitySpec
*/
protected List<CompoundActivitySpec> compoundActivitySpec ;




/**  
* Field wBSElementSpec
*/
protected List<WBSElementSpec> wBSElementSpec ;




/**  
* Field id
*/
protected String id ;




/**  
* Field descr
*/
protected String descr ;




/**  
* Field unit
*/
protected String unit ;




/**  
* Field specVersionNr
*/
protected String specVersionNr ;




/**  
* Field activitySpec
*/
protected List<ActivitySpec> activitySpec ;




/**  
* Field activitySpec1
*/
protected List<ActivitySpec> activitySpec1 ;


}