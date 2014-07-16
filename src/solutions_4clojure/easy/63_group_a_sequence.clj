; restrictions: group-by

(defn grp-by [f s]
  (reduce #(assoc %1 (f %2) (conj (apply vector (%1 (f %2))) %2))
  {}
  s))


(= (grp-by #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})

(= (grp-by #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})

(= (grp-by count [[1] [1 2] [3] [1 2 3] [2 3]])
   {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})
