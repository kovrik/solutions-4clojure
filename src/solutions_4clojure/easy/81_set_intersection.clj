; restrictions: intersection

(defn intrsctn [f s]
  (set (filter #(s %) f)))

(= (intrsctn #{0 1 2 3} #{2 3 4 5}) #{2 3})

(= (intrsctn #{0 1 2} #{3 4 5}) #{})

(= (intrsctn #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})
