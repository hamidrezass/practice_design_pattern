package com.example.designpaternpractise.behavioral.chain.Leave

class TeamLeader : LeaveHandler() {


    override fun applyLeave(leave: Leave): String {
        if (leave.numberOFDay <= 7) {
            //Employee tier should be 4 or above to get approved
            return if (leave.empTier <= 4) {
                "Your leave days has been APPROVED by TeamLeader";
            } else {
                "You employee Tier level is too low for request " + leave.numberOFDay + " days";
            }

        }
        return next.applyLeave(leave)
    }
}