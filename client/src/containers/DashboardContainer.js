import React from "react";
import DashJobsForm from "../components/DashBoardJobs/DashJobsForm";
import DashJobsList from "../components/DashBoardJobs/DashJobsList"
import { BrowserRouter as Router, Route, Routes, useParams, link } from 'react-router-dom';
import WatchListJob from "../components/WatchListJobs/WatchListJob"
import WatchListJobsList from "../components/WatchListJobs/WatchListJobsList";
import "../components/DashBoardJobs/DashJobs.css";


const DashboardContainer = ({ watchedJobs, appliedForJobs }) => {

    return (
        <div className='dashBoard'>
            <div>
                <h2>My Applied for Jobs!</h2>
                {/* <p> <a className="link" href="/application-form">Add New Application</a> </p> */}
                <DashJobsList appliedForJobs={appliedForJobs} />
            </div>
            <div>
                <h2>My Watch List</h2>
                <WatchListJobsList watchedJobs={watchedJobs} />
            </div>
        </div>
    )
}

export default DashboardContainer;

