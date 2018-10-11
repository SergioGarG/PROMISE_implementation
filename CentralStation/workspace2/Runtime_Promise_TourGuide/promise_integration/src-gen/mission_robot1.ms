robot1[[] (<> (l0))]

	eh_e0[<> (openArea), (X request_attention), (X introduction), (X greet_guest), (X ask_follow), (X ask_sit), (X explain_league), (X QA_session)]

		fb_1[(X detect_and_approach_requesting_person)]

		fb_2[(X detect_and_approach_large_group)]

		fb_3[(X detect_and_approach_small_group)]

		cond_e1[<> (audienceArea)]

		cond_e2[(X ask_follow), <> (audienceArea)]

			fb_1[(X detect_and_approach_requesting_person)]

			fb_2[(X detect_and_approach_large_group)]

			fb_3[(X detect_and_approach_small_group)]


