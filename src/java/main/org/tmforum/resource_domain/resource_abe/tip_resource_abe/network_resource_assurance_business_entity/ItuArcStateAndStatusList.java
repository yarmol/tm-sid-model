/**
* Network Resource Assurance ABE 
* @see <a href="URL#https://www.tmforum.org/Browsable_HTML_SID_R16.5/content/_6G.f.cAJ2HE.d6.kLP.pR.s.o.rX-.w-content.html">Network Resource Assurance ABE</a> 
* @since SID_R16.5
*/

package org.tmforum.resource_domain.resource_abe.tip_resource_abe.network_resource_assurance_business_entity ;

/**
* This data type contains a list of ITU Alarm Reporting Control (ARC) st 
* ates and statuses. Each element of the list identifies a state or stat 
* us and provides its relevant value.See R_TMF518_NRB_I_0004. 
 @since SID_R16.5
*/ 

public  class ItuArcStateAndStatusList  {



/**  
* Field m3100ALARMSTATUS
*/
protected AlarmStatus m3100ALARMSTATUS ;




/**  
* Field m3100ARCQISTATUS
*/
protected ArcQIStatus m3100ARCQISTATUS ;




/**  
* Field m3100ARCSTATE
*/
protected ArcState m3100ARCSTATE ;




/**  
* Field m3100NALMQIINTERVAL
* This attribute contains the No ALarM reporting Qualified Inhibit inter 

* val. Alarm Reporting is turned off until the managed entity is qualifi 

* ed problem-free for a specified persistence interval.</br>Values betwe 

* en 0 and 5940 are allowed which identify an interval between 0 and 99  

* hours with a one-minute granularity. The value "0" indicates that the  

* timer is not running (i.e. no adjustments in time taking place).</br>S 

* ee ITU-T Recommendation M.3100. 

*/
protected Integer m3100NALMQIINTERVAL ;




/**  
* Field m3100NALMTIINTERVAL
* Thia attribute contains the No ALarM reporting Timed Inhibit interval. 

*  Alarm Reporting is turned off for a specified timed interval.</br>Val 

* ues between 0 and 5940 are allowed which identify an interval between  

* 0 and 99 hours with a one-minute granularity. The value "0" indicates  

* that the timer is not running (i.e. no adjustments in time taking plac 

* e).</br>See ITU-T Recommendation M.3100. 

*/
protected Integer m3100NALMTIINTERVAL ;


}