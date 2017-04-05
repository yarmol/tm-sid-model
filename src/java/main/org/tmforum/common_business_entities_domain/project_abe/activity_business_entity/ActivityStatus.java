/**
* Activity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536ED0125-content.html">Activity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.activity_business_entity ;

/**
* The lifecycle flag for the Activity Possible statuses are Proposed, Im 
* plemented, Completed, Abandoned and Suspended. 
 @since SID_R16.5
*/ 

public abstract class ActivityStatus  {



/**  
* Field activity
*/
protected Activity activity ;




/**  
* Field validFor
*/
protected TimePeriod validFor ;




/**  
* Field sequenceNr
*/
protected String sequenceNr ;


}