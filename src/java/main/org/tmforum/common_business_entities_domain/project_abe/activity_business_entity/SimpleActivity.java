/**
* Activity ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_3E3F0EC000E93DF536ED0125-content.html">Activity ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.common_business_entities_domain.project_abe.activity_business_entity ;

/**
* An indivisible item of work, that aligns to a task in a process. 

Inheritance tree: |- 
 <a title="SID Models::Common Business Entities Domain::Project ABE::Activity ABE::Activity" href="_3E3F0EC000E93D5C65CD031E-content.html">SID Models::Common Business Entities Domain::Project ABE::Activity ABE::Activity</a> |- 
 SID Models::Common Business Entities Domain::Project ABE::Project Element ABE::ProjectElement @since SID_R16.5
*/ 

public  class SimpleActivity extends Activity,ProjectElement {



/**  
* Field percentComplete
* Indicates how much work has been completed for the Activity</br></br>P 

* ermitted Values: 0-100</br> 

*/
protected Integer percentComplete ;




/**  
* Field isOnCriticalPath
* Indicates if the Activity is on the Project critical path 

*/
protected Boolean isOnCriticalPath ;


}