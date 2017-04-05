/**
* Activity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536ED0125-content.html">Activity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.activity_business_entity ;

/**
* A small item of work, that aligns to a task in a process 

Inheritance tree: |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElement @since SID_R16.5
*/ 

public abstract class Activity extends ProjectElement {



/**  
* Field activityEventEntry
*/
protected ActivityEventEntry activityEventEntry ;




/**  
* Field activitySpec
*/
protected ActivitySpec activitySpec ;




/**  
* Field compoundActivity
*/
protected CompoundActivity compoundActivity ;




/**  
* Field trigger
*/
protected List<Trigger> trigger ;




/**  
* Field projectResourceAllocation
*/
protected ProjectResourceAllocation projectResourceAllocation ;




/**  
* Field activityStatus
*/
protected List<ActivityStatus> activityStatus ;




/**  
* Field wBSElement
*/
protected WBSElement wBSElement ;




/**  
* Field allocatedProjectResource
*/
protected AllocatedProjectResource allocatedProjectResource ;




/**  
* Field activityNr
* A unique identifier for the Activity 

*/
protected String activityNr ;




/**  
* Field name
*/
protected String name ;




/**  
* Field actualCost
* The cost actually booked to the activity 

*/
protected Money actualCost ;




/**  
* Field activitySpecCostParameter
*/
protected ActivitySpecCostParameter activitySpecCostParameter ;




/**  
* Field projectResource
*/
protected List<ProjectResource> projectResource ;




/**  
* Field activity
*/
protected List<Activity> activity ;




/**  
* Field activity1
*/
protected List<Activity> activity1 ;


}