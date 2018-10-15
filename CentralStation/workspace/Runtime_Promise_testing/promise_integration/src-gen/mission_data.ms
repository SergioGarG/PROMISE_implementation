Robots [ robot1,robot2,robot3,robot4, ]
Events [ e1 intruder_detected,e2 out_battery, ]
Actions [ a1 raise_alarm,a2 charge, ]
StoppingEvents [ {robot1,[] (<> (l1) && <> (l2)),e1}{robot1,(X raise_alarm),e2}{robot1,[] (<> (lcharge) && <> (l1)),e1} ]

