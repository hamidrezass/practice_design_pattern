package com.example.designpaternpractise.behavioral.chain.Leave

class Manager : LeaveHandler() {


    override fun applyLeave(leave: Leave): String {
        if (leave.numberOFDay > 21) {
            //Employee tier should be 2 or above & reason type should be "Special" to get approved
            if (leave.empTier <= 2 && leave.reason == ReasonType.SPECIAL) {
                return "Your leave days has been APPROVED by Manager";
            }
        }
        return "Your leave request has been DENIED by Manager";
    }
}