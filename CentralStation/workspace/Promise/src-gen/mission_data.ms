Robots [ r1,r2, ]
Events [ intruder unknown person detected,found_object object detected,help_requested r1 requests help,r1_low_battery r1 low battery,r2_low_battery r2 low battery,finish the robot is requested to stop, ]
Actions [ raise_alarm raise the alarm!,request_help request help from r2,grasp_object grasp the object,release_object release the object,charge_battery charge the battery, ]
StoppingEvents [ {r1,[] (<> ((l1) && <> ((l2) && <> ((l3)))))),finish} ]
