package com.example.designpaternpractise.behavioral.chain.Leave

class ProjectLeader : LeaveHandler() {


    override fun applyLeave(leave: Leave): String {
        return if (leave.numberOFDay <= 14) {
            //Employee tier should be 4 or above to get approved
            if (leave.empTier <= 3) {
                return "Your leave days has been APPROVED by Project Leader";
            } else {
                "You employee Tier level is too low for request " + leave.numberOFDay + " days";
            }
        } else {
          return  next.applyLeave(leave)
        }
    }
}