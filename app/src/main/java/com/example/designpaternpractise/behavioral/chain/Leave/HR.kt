package com.example.designpaternpractise.behavioral.chain.Leave

class HR : LeaveHandler() {


    override fun applyLeave(leave: Leave): String {

        if (leave.numberOFDay <= 21) {
            //Employee tier should be 3 or above & reason type should not be "Regular" to get approved
            if (leave.empTier <= 3 && leave.reason != ReasonType.REGULAR) {
                return "Your leave days has been APPROVED by HR";
            } else {
                return "Your leave request has been DENIED by HR";
            }
        } else {
            return next.applyLeave(leave)
        }
    }
}